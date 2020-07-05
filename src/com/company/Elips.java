package com.company;

public class Elips {
    private double a;
    private double b;

    public Elips(double axisA, double axisb) {
        this.a = axisA;
        this.b = axisb;
    }

    public double caclculateSquare() {
        return Math.PI * a * b;
    }

    public double calculatePerimetr() {
        return ((Math.PI * a * (a + this.b) + (a - b)) / b) * 4;
    }
}