$(function () {
    $.ajax({
        method: 'GET',//请求方法
        url: "/resource/getResourceList",
        data: {resourceType: "1"},
        success: function (data) {
            $("#nav").html(getHtml(data));
        }
    });


    function getHtml(data) {
        var menus = '';
        for (var i = 0; i < data.length; i++) {

            var item = data[i];

            if (item.children !== undefined && item.children !== null && item.children.length > 0) {
                menus += '<li>\n' +
                    '<a href="javascript:;">\n' +
                    '<i class="iconfont left-nav-li" lay-tips="' + item.name + '">&#xe723;</i>\n' +
                    '<cite>' + item.name + '</cite>\n' +
                    '<i class="iconfont nav_right">&#xe697;</i></a>';
                menus += '<ul class="sub-menu">';
                //二级菜单
                for (var j = 0; j < item.children.length; j++) {
                    var subItem = item.children[j];
                    menus += '<li>\n' +
                        '<a onclick="xadmin.add_tab(\'' + subItem.name + '\',\'' + subItem.url + '\')">\n' +
                        '<i class="iconfont">&#xe6a7;</i>\n' +
                        '<cite>' + subItem.name + '</cite></a>\n' +
                        '</li>';
                    getHtml(subItem);

                }
                menus += '</ul>';
            } else {
                menus += '<li>\n' +
                    '<a onclick="xadmin.add_tab(\'' + item.name + '\',\'' + item.url + '\')">\n' +
                    '<i class="iconfont left-nav-li" lay-tips="' + item.name + '">&#xe723;</i>\n' +
                    '<cite>' + item.name + '</cite></a>';
            }
            menus += '</li>';
        }

        return menus;
    }

})