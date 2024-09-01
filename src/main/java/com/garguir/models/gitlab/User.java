package com.garguir.models.gitlab;

public class User {
    private int id;
    private String name;
    private String userName;
    private String state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User id(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User name(String name) {
        this.name = name;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User userName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public User state(String state) {
        this.state = state;
        return this;
    }
}
