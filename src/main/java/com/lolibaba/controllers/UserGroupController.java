package com.lolibaba.controllers;


import com.lolibaba.models.UserGroup;
import com.lolibaba.services.IUserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by renruiquan on 2017/6/26.
 */

@RestController
@RequestMapping("/userGroup")
public class UserGroupController {

    @Autowired
    private IUserGroupService userGroupService;

    @GetMapping("/getList")
    public List<UserGroup> getList() {
        return  userGroupService.findUserGroup();
    }
}
