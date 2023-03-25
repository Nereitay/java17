package com.itheima.demo;

public class Movie {
    private String name;
    private double score;
    private String actors;

    public Movie() {
    }

    public Movie(String name, double score, String actors) {
        this.name = name;
        this.score = score;
        this.actors = actors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }
}
