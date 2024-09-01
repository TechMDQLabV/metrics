package com.garguir.models.gitlab;

import java.time.LocalDate;

public class Milestone {
    private int id;
    private int iid;
    private int projectId;
    private String title;
    private String description;
    private String state;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private LocalDate dueDate;
    private LocalDate startDate;
    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public Milestone id(int id) {
        this.id = id;
        return this;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public int getIid() {
        return iid;
    }

    public Milestone iid(int iid) {
        this.iid = iid;
        return this;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getProjectId() {
        return projectId;
    }

    public Milestone projectId(int projectId) {
        this.projectId = projectId;
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Milestone title(String title) {
        this.title = title;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Milestone description(String description) {
        this.description = description;
        return this;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Milestone state(String state) {
        this.state = state;
        return this;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public Milestone createdAt(LocalDate createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public Milestone updatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public Milestone dueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public Milestone startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public Milestone url(String url) {
        this.url = url;
        return this;
    }
}
