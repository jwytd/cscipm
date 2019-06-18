package com.csci.cscipm.core.shiro;

import com.csci.cscipm.core.constant.CsciConstant;
import com.csci.cscipm.module.sys.model.User;
import com.csci.cscipm.module.sys.service.IUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

public class CsciRealm extends AuthorizingRealm {
    @Autowired
    private IUserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username = (String)principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
//        authorizationInfo.setRoles(userService.findRoles(username));
//        authorizationInfo.setStringPermissions(userService.findPermissions(username));
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = (String)authenticationToken.getPrincipal();
        User user = userService.getUserByAccount(username);

        if(user == null) {
            throw new UnknownAccountException();//没找到帐号
        }
        if(CsciConstant.ACCOUNT_STATUS_LOCKED.equals(user.getStatus())) {
            throw new LockedAccountException(); //帐号锁定
        }
//        //交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以在此判断或自定义实现
//        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
//                user.getAccount(), //用户名
//                user.getPassword(), //密码
//                ByteSource.Util.bytes(user.getSalt()),//salt=username+salt
//                getName()  //realm name
//        );
        // 密码加盐处理
        String source = user.getSalt();
        ByteSource credentialsSalt = new Md5Hash(source);
        return new SimpleAuthenticationInfo(user.getAccount(), user.getPassword(), getName());
    }
}
