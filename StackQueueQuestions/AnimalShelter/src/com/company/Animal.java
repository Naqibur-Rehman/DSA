package com.company;

public abstract class Animal {
    private int order;
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String name();

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    public boolean isOlderthan(Animal animal) {
        return this.order < animal.order;
    }
}
