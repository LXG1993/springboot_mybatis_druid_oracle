package com.lolibaba.models;

/**
 * Created by renruiquan on 2017/6/26.
 */
public class UserGroup {

    private Integer id;

    private Integer userId;

    private Integer groupId;

    private String userName;

    private String groupName; //部门名称


    private String oprCode;


    public UserGroup() {
    }

    public UserGroup(Integer groupId, String groupName, Integer userId, String userName) {
        this.userId = userId;
        this.groupId = groupId;
        this.userName = userName;
        this.groupName = groupName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public void setOprCode(String oprCode) {
        this.oprCode = oprCode;
    }

    public String getOprCode() {

        return oprCode;
    }

    @Override
    public String toString() {
        return "UserGroup{" +
                "id=" + id +
                ", userId=" + userId +
                ", groupId=" + groupId +
                ", userName='" + userName + '\'' +
                ", groupName='" + groupName + '\'' +
                ", oprCode='" + oprCode + '\'' +
                '}';
    }
}
