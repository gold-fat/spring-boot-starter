package com.imooc.controller;


import com.imooc.common.ServerResponse;
import com.imooc.pojo.SysUser;
import com.imooc.service.ISysUserService;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA.
 * User: LiHanFei
 * Date_Time: 2019-01-1409:59
 * Package_Name:com.imooc.controller
 */
@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private ISysUserService iSysUserService;

    @Autowired
    private Sid sid;


    @RequestMapping(value = "")
    @ResponseBody
    public ServerResponse selectUserMessage(SysUser user){
        return null;
    }

    @RequestMapping(value = "create_user")
    @ResponseBody
    public ServerResponse createUserMessage(SysUser user){
       return iSysUserService.createUserMessage(user);
    }

    @RequestMapping(value = "")
    @ResponseBody
    public ServerResponse updateUserMessage(SysUser user){

        return null;
    }


    @RequestMapping(value = "")
    @ResponseBody
    public ServerResponse deleteUserMessage(Integer id){

        return null;
    }

}
