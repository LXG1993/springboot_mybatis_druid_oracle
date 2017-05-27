package com.lolibaba.models;

import java.util.Date;

/**
 * Created by renruiquan on 2017/5/27.
 */
public class City {
    /**
     * 定义字段
     */
    private int id;
    private String name;
    private Date createDateTime;

    /**
     * 默认构造器
     */
    public City() {
    }

    /**
     * 带参数的构造器
     *
     * @param id
     * @param name
     * @param createDateTime
     */
    public City(int id, String name, Date createDateTime) {
        this.id = id;
        this.name = name;
        this.createDateTime = createDateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createDateTime=" + createDateTime +
                '}';
    }
}
