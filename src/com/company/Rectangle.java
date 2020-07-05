package com.company;

public class Rectangle {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculateSquare() {
        return a * b;
    }

    public int calculatesPerimetr() {
        return (a + b) * 2;
    }

}
