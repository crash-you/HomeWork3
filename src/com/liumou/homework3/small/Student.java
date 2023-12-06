package com.liumou.homework3.small;

public class Student {
    private String name;
    private boolean hasVoted;

    public Student(String name) {
        this.name = name;
        this.hasVoted = false;
    }

    public String getName() {
        return name;
    }

    public boolean hasVoted() {
        return hasVoted;
    }

    public void vote() {
        this.hasVoted = true;
    }
}
