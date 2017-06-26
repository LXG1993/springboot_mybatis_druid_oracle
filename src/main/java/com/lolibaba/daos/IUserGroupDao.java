package com.lolibaba.daos;

import com.lolibaba.models.UserGroup;

import java.util.List;

/**
 * Created by renruiquan on 2017/6/26.
 */
public interface IUserGroupDao {
    List<UserGroup> findUserGroup();
}
