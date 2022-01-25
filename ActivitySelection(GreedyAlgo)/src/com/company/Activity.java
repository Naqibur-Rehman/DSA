package com.company;

public class Activity {
    private String name;
    private int startTime;
    private int finishTime;

    public Activity(String name, int startTime, int finishTime) {
        this.name = name;
        this.startTime = startTime;
        this.finishTime = finishTime;
    }

    public String getName() {
        return name;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getFinishTime() {
        return finishTime;
    }

    @Override
    public String toString() {
        return "Activity: " + name +
                ", startTime = " + startTime +
                ", finishTime = " + finishTime;
    }

}
