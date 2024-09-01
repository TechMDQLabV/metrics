package com.garguir.models.gitlab;

import java.time.LocalDate;
import java.util.List;

public class Project {
    private int id;
    private String description;
    private String name;
    private String nameWithNamespace;
    private String path;
    private LocalDate createdAt;
    private LocalDate lastActivity;
    private List<Commit> commits;
    private List<MergeRequest> mergeRequests;
    private List<Tag> tags;
    private List<Release> releases;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Project id(int id) {
        this.id = id;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Project description(String description) {
        this.description = description;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Project name(String name) {
        this.name = name;
        return this;
    }

    public void setNameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
    }

    public String getNameWithNamespace() {
        return nameWithNamespace;
    }

    public Project nameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
        return this;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public Project path(String path) {
        this.path = path;
        return this;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public Project createdAt(LocalDate createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public void setLastActivity(LocalDate lastActivity) {
        this.lastActivity = lastActivity;
    }

    public LocalDate getLastActivity() {
        return lastActivity;
    }

    public Project lastActivity(LocalDate lastActivity) {
        this.lastActivity = lastActivity;
        return this;
    }

    public void setCommits(List<Commit> commits) {
        this.commits = commits;
    }

    public List<Commit> getCommits() {
        return commits;
    }

    public Project commits(List<Commit> commits) {
        this.commits = commits;
        return this;
    }

    public void setMergeRequests(List<MergeRequest> mergeRequests) {
        this.mergeRequests = mergeRequests;
    }

    public List<MergeRequest> getMergeRequests() {
        return mergeRequests;
    }

    public Project mergeRequests(List<MergeRequest> mergeRequests) {
        this.mergeRequests = mergeRequests;
        return this;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public Project tags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public void setReleases(List<Release> releases) {
        this.releases = releases;
    }

    public List<Release> getReleases() {
        return releases;
    }

    public Project releases(List<Release> releases) {
        this.releases = releases;
        return this;
    }
}