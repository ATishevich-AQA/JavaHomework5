package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(3);
        System.out.println(square.calculatesPerimetr());
        System.out.println(square.calculateSquare());

        Circle circle = new Circle(2);
        System.out.println(circle.caclculateSquare());
        System.out.println(circle.calculatePerimetr());// write your code here
    }
}
