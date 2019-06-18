package com.csci.cscipm.module.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.csci.cscipm.module.sys.dao.NoticeMapper;
import com.csci.cscipm.module.sys.model.Notice;
import com.csci.cscipm.module.sys.service.INoticeService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 通知表 服务实现类
 * </p>
 *
 * @author wudan
 * @since 2019-06-01
 */
@Service
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements INoticeService {

}
