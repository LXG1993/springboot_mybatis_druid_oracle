package com.lolibaba.services.impl;


import com.lolibaba.daos.IUserGroupDao;
import com.lolibaba.models.UserGroup;
import com.lolibaba.services.IUserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by renruiquan on 2017/6/26.
 */

@Service("userGroupService")
public class UserGroupServiceImpl implements IUserGroupService {

    @Autowired
    private IUserGroupDao userGroupDao;

    @Override
    public List<UserGroup> findUserGroup() {
        return userGroupDao.findUserGroup();
    }
}
