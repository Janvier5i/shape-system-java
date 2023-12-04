package org.example;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(12 , 3);
        Triangle triangle = new Triangle(12,7,6);

        ShowPerimeter.printPerimeter(rectangle);
        ShowPerimeter.printPerimeter(circle);
        ShowPerimeter.printPerimeter(triangle);

    }
}