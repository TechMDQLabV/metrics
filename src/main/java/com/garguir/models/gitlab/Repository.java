package com.garguir.models.gitlab;

import java.time.LocalDate;

public class Repository {
    private int id;
    private String name;
    private LocalDate createdAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Repository id(int id){
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Repository name(String name){
        this.name = name;
        return this;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public Repository createdAt(LocalDate createdAt){
        this.createdAt = createdAt;
        return this;
    }

}
