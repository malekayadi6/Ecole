package com.schoolmanager.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Mahdi on 3/24/2016.
 */
public class Users {

    @Id
    @GeneratedValue
    private  int userId;
    private String username;
    private String password;
    private boolean enabeled;
    private int customerId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabeled() {
        return enabeled;
    }

    public void setEnabeled(boolean enabeled) {
        this.enabeled = enabeled;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
