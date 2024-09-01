package com.garguir.models.gitlab;

public class TaskCompletionStatus {
    private int cout;
    private int completedCount;

    public void setCout(int cout) {
        this.cout = cout;
    }

    public int getCout() {
        return cout;
    }

    public TaskCompletionStatus cout(int cout) {
        this.cout = cout;
        return this;
    }

    public void setCompletedCount(int completedCount) {
        this.completedCount = completedCount;
    }

    public int getCompletedCount() {
        return completedCount;
    }

    public TaskCompletionStatus completedCount(int completedCount) {
        this.completedCount = completedCount;
        return this;
    }
}
