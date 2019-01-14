package com.imooc.service;

import com.imooc.common.ServerResponse;
import com.imooc.pojo.SysUser;

/**
 * Created by IntelliJ IDEA.
 * User: LiHanFei
 * Date_Time: 2019-01-1410:01
 * Package_Name:com.imooc.service
 */
public interface ISysUserService {

    /**
     * 创建用户
     * @param user
     * @return
     */
    ServerResponse createUserMessage(SysUser user);
}
