package com.garguir.models.gitlab;

import java.time.LocalDate;

public class Release {
    private String tagName;
    private String description;
    private String name;
    private LocalDate createdAt;
    private LocalDate releasedAt;
    private User author;
    private Commit commit;

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }

    public Release tagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Release description(String description) {
        this.description = description;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Release name(String name) {
        this.name = name;
        return this;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public Release createdAt(LocalDate createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public void setReleasedAt(LocalDate releasedAt) {
        this.releasedAt = releasedAt;
    }

    public LocalDate getReleasedAt() {
        return releasedAt;
    }

    public Release releasedAt(LocalDate releasedAt) {
        this.releasedAt = releasedAt;
        return this;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public User getAuthor() {
        return author;
    }

    public Release author(User author) {
        this.author = author;
        return this;
    }

    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    public Commit getCommit() {
        return commit;
    }

    public Release commit(Commit commit) {
        this.commit = commit;
        return this;
    }
}
