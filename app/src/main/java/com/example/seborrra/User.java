package com.example.seborrra;

public class User {
    private String username;
    private String password;
    private String typeUser;
    private String phone;

    public User(String username, String password, String typeUser, String phone) {
        this.username = username;
        this.password = password;
        this.typeUser = typeUser;
        this.phone = phone;
    }
    public User() {
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getTypeUser() {
        return typeUser;
    }
    public String getPhone() {
        return phone;
    }
}
