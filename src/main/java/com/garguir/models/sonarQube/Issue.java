package com.garguir.models.sonarQube;

import java.time.LocalDate;

public class Issue {
    private String key;
    private String rule;
    private String severity;
    private String component;
    private String project;
    private String message;
    private String line;
    private String status;
    private LocalDate creationDate;
    private LocalDate updateDate;

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public Issue key(String key) {
        this.key = key;
        return this;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getRule() {
        return rule;
    }

    public Issue rule(String rule) {
        this.rule = rule;
        return this;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getSeverity() {
        return severity;
    }

    public Issue severity(String severity) {
        this.severity = severity;
        return this;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getComponent() {
        return component;
    }

    public Issue component(String component) {
        this.component = component;
        return this;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getProject() {
        return project;
    }

    public Issue project(String project) {
        this.project = project;
        return this;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public Issue message(String message) {
        this.message = message;
        return this;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getLine() {
        return line;
    }

    public Issue line(String line) {
        this.line = line;
        return this;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public Issue status(String status) {
        this.status = status;
        return this;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public Issue creationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public Issue updateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
        return this;
    }
}