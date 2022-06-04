package com.metajrs.entity;

import lombok.Data;


@Data
public class accountList {
    private int account_id;
    private String account_name;
    private String password;
    private String power;
    private String phone;
    private String email;
    private String orderList_id;

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrderList_id() {
        return orderList_id;
    }

    public void setOrderList_id(String orderList_id) {
        this.orderList_id = orderList_id;
    }
}
