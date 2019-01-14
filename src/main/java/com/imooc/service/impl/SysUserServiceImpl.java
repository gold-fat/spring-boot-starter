package com.imooc.service.impl;

import com.imooc.common.ServerResponse;
import com.imooc.dao.SysUserMapper;
import com.imooc.pojo.SysUser;
import com.imooc.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: LiHanFei
 * Date_Time: 2019-01-1410:01
 * Package_Name:com.imooc.service.impl
 */
@Service("iSysUserService")
public class SysUserServiceImpl implements ISysUserService {


    @Autowired
    private SysUserMapper sysUserMapper;

    /**
     * 添加用户
     * @param user
     * @return
     */
    @Override
    public ServerResponse createUserMessage(SysUser user){
        int insert = sysUserMapper.insert(user);
        if (insert > 0){
            return ServerResponse.createBySuccessMessage("添加用户信息成功");
        }
        return ServerResponse.createByErrorMessage("添加用户信息失败");
    }
}
