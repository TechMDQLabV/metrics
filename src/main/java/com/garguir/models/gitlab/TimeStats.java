package com.garguir.models.gitlab;

public class TimeStats {
    private int timeEstimate;
    private int totalTimeSpend;

    public void setTimeEstimate(int timeEstimate) {
        this.timeEstimate = timeEstimate;
    }

    public int getTimeEstimate() {
        return timeEstimate;
    }

    public TimeStats timeEstimate(int timeEstimate) {
        this.timeEstimate = timeEstimate;
        return this;
    }

    public void setTotalTimeSpend(int totalTimeSpend){
        this.totalTimeSpend = totalTimeSpend;
    }

    public int getTotalTimeSpend() {
        return totalTimeSpend;
    }

    public TimeStats totalTimeSpend(int totalTimeSpend) {
        this.totalTimeSpend = totalTimeSpend;
        return this;
    }
}
