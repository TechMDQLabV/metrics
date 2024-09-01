package com.garguir.models.gitlab;

import java.time.LocalDate;
import java.util.List;

public class MergeRequest {
    private int id;
    private int iid;
    private int projectId;
    private String title;
    private String description;
    private String state;
    private String imported;
    private String importedFrom;
    private User mergeUser;
    private LocalDate mergedAt;
    private LocalDate preparedAt;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private String targetBranch;
    private String sourceBranch;
    private User author;
    private User assignee;
    private List<User> assignees;
    private List<User> reviewers;
    private int sourceProjectId;
    private int targetProjectId;
    private List<String> labels;
    private boolean draft;
    private boolean workInProgress;
    private Milestone milestone;
    private boolean mergeWhenPipelineSucceeds;
    private String mergeStatus;
    private String detailedMergeStatus;
    private String sha;
    private int userNotesCount;
    private boolean shouldRemoveSourceBranch;
    private boolean forceRemoveSourceBranch;
    private String webUrl;
    private References references;
    private TimeStats timeStats;
    private boolean squash;
    private TaskCompletionStatus taskCompletionStatus;

    public int getId() {
        return id;
    }

    public MergeRequest setId(int id) {
        this.id = id;
        return this;
    }

    public int getIid() {
        return iid;
    }

    public MergeRequest setIid(int iid) {
        this.iid = iid;
        return this;
    }

    public int getProjectId() {
        return projectId;
    }

    public MergeRequest setProjectId(int projectId) {
        this.projectId = projectId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public MergeRequest setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public MergeRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getState() {
        return state;
    }

    public MergeRequest setState(String state) {
        this.state = state;
        return this;
    }

    public String getImported() {
        return imported;
    }

    public MergeRequest setImported(String imported) {
        this.imported = imported;
        return this;
    }

    public String getImportedFrom() {
        return importedFrom;
    }

    public MergeRequest setImportedFrom(String importedFrom) {
        this.importedFrom = importedFrom;
        return this;
    }

    public User getMergeUser() {
        return mergeUser;
    }

    public MergeRequest setMergeUser(User mergeUser) {
        this.mergeUser = mergeUser;
        return this;
    }

    public LocalDate getMergedAt() {
        return mergedAt;
    }

    public MergeRequest setMergedAt(LocalDate mergedAt) {
        this.mergedAt = mergedAt;
        return this;
    }

    public LocalDate getPreparedAt() {
        return preparedAt;
    }

    public MergeRequest setPreparedAt(LocalDate preparedAt) {
        this.preparedAt = preparedAt;
        return this;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public MergeRequest setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public MergeRequest setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getTargetBranch() {
        return targetBranch;
    }

    public MergeRequest setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }

    public String getSourceBranch() {
        return sourceBranch;
    }

    public MergeRequest setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }

    public User getAuthor() {
        return author;
    }

    public MergeRequest setAuthor(User author) {
        this.author = author;
        return this;
    }

    public User getAssignee() {
        return assignee;
    }

    public MergeRequest setAssignee(User assignee) {
        this.assignee = assignee;
        return this;
    }

    public List<User> getAssignees() {
        return assignees;
    }

    public MergeRequest setAssignees(List<User> assignees) {
        this.assignees = assignees;
        return this;
    }

    public List<User> getReviewers() {
        return reviewers;
    }

    public MergeRequest setReviewers(List<User> reviewers) {
        this.reviewers = reviewers;
        return this;
    }

    public int getSourceProjectId() {
        return sourceProjectId;
    }

    public MergeRequest setSourceProjectId(int sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
        return this;
    }

    public int getTargetProjectId() {
        return targetProjectId;
    }

    public MergeRequest setTargetProjectId(int targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }

    public List<String> getLabels() {
        return labels;
    }

    public MergeRequest setLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public boolean isDraft() {
        return draft;
    }

    public MergeRequest setDraft(boolean draft) {
        this.draft = draft;
        return this;
    }

    public boolean isWorkInProgress() {
        return workInProgress;
    }

    public MergeRequest setWorkInProgress(boolean workInProgress) {
        this.workInProgress = workInProgress;
        return this;
    }

    public Milestone getMilestone() {
        return milestone;
    }

    public MergeRequest setMilestone(Milestone milestone) {
        this.milestone = milestone;
        return this;
    }

    public boolean isMergeWhenPipelineSucceeds() {
        return mergeWhenPipelineSucceeds;
    }

    public MergeRequest setMergeWhenPipelineSucceeds(boolean mergeWhenPipelineSucceeds) {
        this.mergeWhenPipelineSucceeds = mergeWhenPipelineSucceeds;
        return this;
    }

    public String getMergeStatus() {
        return mergeStatus;
    }

    public MergeRequest setMergeStatus(String mergeStatus) {
        this.mergeStatus = mergeStatus;
        return this;
    }

    public String getDetailedMergeStatus() {
        return detailedMergeStatus;
    }

    public MergeRequest setDetailedMergeStatus(String detailedMergeStatus) {
        this.detailedMergeStatus = detailedMergeStatus;
        return this;
    }

    public String getSha() {
        return sha;
    }

    public MergeRequest setSha(String sha) {
        this.sha = sha;
        return this;
    }

    public int getUserNotesCount() {
        return userNotesCount;
    }

    public MergeRequest setUserNotesCount(int userNotesCount) {
        this.userNotesCount = userNotesCount;
        return this;
    }

    public boolean isShouldRemoveSourceBranch() {
        return shouldRemoveSourceBranch;
    }

    public MergeRequest setShouldRemoveSourceBranch(boolean shouldRemoveSourceBranch) {
        this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
        return this;
    }

    public boolean isForceRemoveSourceBranch() {
        return forceRemoveSourceBranch;
    }

    public MergeRequest setForceRemoveSourceBranch(boolean forceRemoveSourceBranch) {
        this.forceRemoveSourceBranch = forceRemoveSourceBranch;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public MergeRequest setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    public References getReferences() {
        return references;
    }

    public MergeRequest setReferences(References references) {
        this.references = references;
        return this;
    }

    public TimeStats getTimeStats() {
        return timeStats;
    }

    public MergeRequest setTimeStats(TimeStats timeStats) {
        this.timeStats = timeStats;
        return this;
    }

    public boolean isSquash() {
        return squash;
    }

    public MergeRequest setSquash(boolean squash) {
        this.squash = squash;
        return this;
    }

    public TaskCompletionStatus getTaskCompletionStatus() {
        return taskCompletionStatus;
    }

    public MergeRequest setTaskCompletionStatus(TaskCompletionStatus taskCompletionStatus) {
        this.taskCompletionStatus = taskCompletionStatus;
        return this;
    }
}
