package com.pack;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

public class Rectangle{
    //instance variables
    private double width;
    private double length;
    //instance methods
    public double findArea(){
        return width*height;
    }
    public double findPerimeter(){
        return (width+height)*2;
    }
}

public class RectangleApp {
    public static void main( String[] args ){
        Rectangle rect = new Rectangle();
        System.out.println("The area of rectangle is " + rect.findArea() );
        System.out.println("The perimeter of rectangle is " + rect.findPerimeter() );
    }
}
