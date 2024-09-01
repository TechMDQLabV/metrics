package com.garguir.models.sonarQube;

public class Measure {

    private String metric;
    private String value;
    private boolean bestValue;

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public String getMetric() {
        return metric;
    }

    public Measure metric(String metric) {
        this.metric = metric;
        return this;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Measure value(String value) {
        this.value = value;
        return this;
    }

    public void setBestValue(boolean bestValue) {
        this.bestValue = bestValue;
    }

    public boolean isBestValue() {
        return bestValue;
    }

    public Measure bvestValue(boolean bestValue) {
        this.bestValue = bestValue;
        return this;
    }
}
