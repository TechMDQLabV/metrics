package com.garguir.models.gitlab;

import java.time.LocalDate;

public class Tag {
    private Commit commit;
    private Release release;
    private String name;
    private String target;
    private String message;
    private boolean protected_;
    private LocalDate createdAt;

    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    public Commit getCommit() {
        return commit;
    }

    public Tag commit(Commit commit) {
        this.commit = commit;
        return this;
    }

    public void setRelease(Release release) {
        this.release = release;
    }

    public Release getRelease() {
        return release;
    }

    public Tag release(Release release) {
        this.release = release;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Tag name(String name) {
        this.name = name;
        return this;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getTarget() {
        return target;
    }

    public Tag target(String target) {
        this.target = target;
        return this;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public Tag message(String message) {
        this.message = message;
        return this;
    }

    public void setProtected_(boolean protected_) {
        this.protected_ = protected_;
    }

    public boolean isProtected_() {
        return protected_;
    }

    public Tag protected_(boolean protected_) {
        this.protected_ = protected_;
        return this;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public Tag createdAt(LocalDate createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
