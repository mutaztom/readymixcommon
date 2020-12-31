package com.rationalteam.reaymixcommon;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
public class MobileUser {
    private Integer id;
    private String username;
    private String item;
    private String email;
    private String address;
    private String mobile;
    private String password;
    private String usertype;


    public MobileUser(String username, String item) {
        this.username = username;
        this.item = item;
    }

    public MobileUser() {

    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getUsername() {
        return username;
    }

    public String getItem() {
        return item;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setType(String type) {
        usertype = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
}
