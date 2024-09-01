package com.garguir.models.gitlab;

public class References {
    private String short_;
    private String relative;
    private String full;

    public void setShort_(String short_) {
        this.short_ = short_;
    }

    public String getShort_() {
        return short_;
    }

    public References short_(String short_) {
        this.short_ = short_;
        return this;
    }

    public void setRelative(String relative) {
        this.relative = relative;
    }

    public String getRelative() {
        return relative;
    }

    public References relative(String relative) {
        this.relative = relative;
        return this;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public String getFull() {
        return full;
    }

    public References full(String full) {
        this.full = full;
        return this;
    }
}
