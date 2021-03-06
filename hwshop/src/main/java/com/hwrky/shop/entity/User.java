package com.hwrky.shop.entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class User {
    private Integer user_id;
    private String user_name;
    private String user_nickname;
    private String user_password;
    private String user_realname;
    private Byte user_gender;
    private Date user_birthday;

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_nickname='" + user_nickname + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_realname='" + user_realname + '\'' +
                ", user_gender=" + user_gender +
                ", user_birthday=" + user_birthday +
                ", user_address=" + 
                '}';
    }

    public User() {
    }

    public User(Integer user_id, String user_name, String user_nickname, String user_password, Byte user_gender) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_nickname = user_nickname;
        this.user_password = user_password;
        this.user_gender = user_gender;
    }

    public User(Integer user_id, String user_name, String user_nickname, String user_password, String user_realname, Byte user_gender, Date user_birthday) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_nickname = user_nickname;
        this.user_password = user_password;
        this.user_realname = user_realname;
        this.user_gender = user_gender;
        this.user_birthday = user_birthday;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public User setUser_id(Integer user_id) {
        this.user_id = user_id;
        return this;
    }

    public String getUser_name() {
        return user_name;
    }

    public User setUser_name(String user_name) {
        this.user_name = user_name;
        return this;
    }

    public String getUser_nickname() {
        return user_nickname;
    }

    public User setUser_nickname(String user_nickname) {
        this.user_nickname = user_nickname;
        return this;
    }

    public String getUser_password() {
        return user_password;
    }

    public User setUser_password(String user_password) {
        this.user_password = user_password;
        return this;
    }

    public String getUser_realname() {
        return user_realname;
    }

    public User setUser_realname(String user_realname) {
        this.user_realname = user_realname;
        return this;
    }

    public Byte getUser_gender() {
        return user_gender;
    }

    public User setUser_gender(Byte user_gender) {
        this.user_gender = user_gender;
        return this;
    }

    public String getUser_birthday() {
        if(user_birthday != null){
            SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd", Locale.UK);
            return time.format(user_birthday);
        }
        return null;
    }

    public User setUser_birthday(Date user_birthday) {
        this.user_birthday = user_birthday;
        return this;
    }


}
