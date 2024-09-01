package com.garguir.models.gitlab;

import java.time.LocalDate;

public class Commit {
    private String id;
    private String shortId;
    private String title;
    private String authorName;
    private String authorEmail;
    private LocalDate authoredDate;
    private String commitedName;
    private String commitedEmail;
    private LocalDate commitedDate;
    private LocalDate createdAt;
    private String message;
    private String webUrl;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Commit id(String id) {
        this.id = id;
        return this;
    }

    public void setShortId(String shortId) {
        this.shortId = shortId;
    }

    public String getShortId() {
        return shortId;
    }

    public Commit shortId(String shortId) {
        this.shortId = shortId;
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Commit title(String title) {
        this.title = title;
        return this;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Commit authorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public Commit authorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
        return this;
    }

    public void setAuthoredDate(LocalDate authoredDate) {
        this.authoredDate = authoredDate;
    }

    public LocalDate getAuthoredDate() {
        return authoredDate;
    }

    public Commit authoredDate(LocalDate authoredDate) {
        this.authoredDate = authoredDate;
        return this;
    }

    public void setCommitedName(String commitedName) {
        this.commitedName = commitedName;
    }

    public String getCommitedName() {
        return commitedName;
    }

    public Commit commitedName(String commitedName) {
        this.commitedName = commitedName;
        return this;
    }

    public void setCommitedEmail(String commitedEmail) {
        this.commitedEmail = commitedEmail;
    }

    public String getCommitedEmail() {
        return commitedEmail;
    }

    public Commit commitedEmail(String commitedEmail) {
        this.commitedEmail = commitedEmail;
        return this;
    }

    public void setCommitedDate(LocalDate commitedDate) {
        this.commitedDate = commitedDate;
    }

    public LocalDate getCommitedDate() {
        return commitedDate;
    }

    public Commit commitedDate(LocalDate commitedDate) {
        this.commitedDate = commitedDate;
        return this;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public Commit createdAt(LocalDate createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public Commit message(String message) {
        this.message = message;
        return this;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public Commit webUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }
}
