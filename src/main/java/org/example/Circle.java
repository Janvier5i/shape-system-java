package org.example;

public class Circle extends Shape{
    private double diameter;
    final double pi = 3.14;
    public Circle(double diameter) {
        this.diameter = diameter;
    }
    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(pi * diameter);
    }
}
