package com.java_univer.task1.ball;

public class Ball {
    private float weight;
    private float radius;
    private String colour;
    public Ball(float weight, float radius, String colour) {
        this.weight = weight;
        this.radius = radius;
        this.colour = colour;
    }

    public Ball() {
        weight = 0.1F;
        radius = 0.1F;
        colour = "white";
    }


    public void setWeight(float weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
    public String toString(){
        return "weight: " + weight + ", radius: " + radius + ", colour: " + colour;
    }
}
