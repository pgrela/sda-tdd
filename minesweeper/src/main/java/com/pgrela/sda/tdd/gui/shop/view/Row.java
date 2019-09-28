package com.pgrela.sda.tdd.gui.shop.view;

import java.util.List;

class Row {
    private String id;
    private List<String> properties;
    private List<String> actions;

    public Row(String id, List<String> properties, List<String> actions) {
        this.id = id;
        this.properties = properties;
        this.actions = actions;
    }

    public List<String> getProperties() {
        return properties;
    }

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }

    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
