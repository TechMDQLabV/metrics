package com.garguir.models.sonarQube;

public class Component {
    private String id;
    private String key;
    private String name;
    private String qualifier;
    private Measure[] measures;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Component id(String id) {
        this.id = id;
        return this;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public Component key(String key) {
        this.key = key;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Component name(String name) {
        this.name = name;
        return this;
    }

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    public String getQualifier() {
        return qualifier;
    }

    public Component qualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }

    public void setMeasures(Measure[] measures) {
        this.measures = measures;
    }

    public Measure[] getMeasures() {
        return measures;
    }

    public Component measures(Measure[] measures) {
        this.measures = measures;
        return this;
    }
}
