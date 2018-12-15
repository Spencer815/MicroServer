package com.spencer.model.pojo;

import java.util.Date;

/**
 * 用户实体类
 *
 * @author lichao
 * @date 2018/12/3
 **/
public class User {
    private Integer id;

    private String userName;

    private String password;

    private String address;

    private String job;

    private Integer groupId;

    private String city;

    private String province;

    private Boolean state;

    private Date lastLoginTime;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    public User(Integer id, String userName, String password, String address, String job, Integer groupId, String city, String province, Boolean state, Date lastLoginTime, Date createdAt, Date updatedAt, Date deletedAt) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.address = address;
        this.job = job;
        this.groupId = groupId;
        this.city = city;
        this.province = province;
        this.state = state;
        this.lastLoginTime = lastLoginTime;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }
}