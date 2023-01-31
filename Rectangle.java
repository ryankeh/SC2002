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
    private double height;
    //instance methods
    public Rectangle(){
        this(1.0,1.0);
    }
    public Rectangle(double w, double h){
        width = w;
        height = h
    }
    
    public void setWidth( double w ) { width = w ; }
    public void setHeight( double h ) { height = h ; }
    public double getWidth() { return width ; }
    public double getHeight() { return height ; }
    
    public double findArea(){
        return width*height;
    }
    public double findPerimeter(){
        return (width+height)*2;
    }
    public Rectangle copyObjects() {
        Rectangle rect = new Rectangle( width , height );
        return rect;
    }
    public void print() {
        System.out.println("The area of rectangle is "
        + this.findArea() );
        System.out.println("The perimeter of rectangle is "
        + this.findPerimeter() );
    }
}

public class RectangleApp {
    public static void main( String[] args ){
        Rectangle rect = new Rectangle();
        System.out.println("The area of rectangle is " + rect.findArea() );
        System.out.println("The perimeter of rectangle is " + rect.findPerimeter() );
    }
}

public class CopyObjectsApp {
    public static void main(String[] args){
        Rectangle rect1, rect2;
        rect1 = new Rectangle( 10.0 , 20.0 );
        rect2 = rect1.copyObjects();
    }
}
