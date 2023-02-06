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
    //class constants
    public static final double MAX_WIDTH = 100;
    public static final double MAX_HEIGHT = 100;
    //static variable
    private static int numRectangles=0;
    
    //class methods
    public Rectangle(){
        width = 1.0;
        height = 1.0;
        numRectangles++;
    }
    public Rectangle(double w, double h){
        width = w;
        height = h
        numRectangles++;
    }
    
    public void setWidth( double w ) {
        if ( w >= MAX_WIDTH )
            width = MAX_WIDTH ;
        else
            width = w ;
    } 

    public void setHeight( double h ) {
        if ( h >= MAX_HEIGHT )
            height = MAX_HEIGHT ;
        else
            height = h ;
    }
    
    //instance methods
    public double getWidth() { return width ; }
    public double getHeight() { return height ; }
    
    public double findArea(){ return width*height; }
    public double findPerimeter(){ return (width+height)*2; }
    
    //class methods
    public static void setNumRectangles(int number) {
        numRectangles = number ;
    }
    public static int getNumRectangles() {
        return numRectangles ;
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

public class UsingStaticApp {
    public static void main( String[] args ) {
        Rectangle rect1 = new Rectangle( 5.0 , 10.0 );
        print(rect1);
        rect1.setWidth( 40.0 );
        rect1.setHeight( 10.0 );
        print(rect1);
        Rectangle rect2 = new Rectangle( 50.0 , 100.0 );
        System.out.println( "Number of rectangles = " +
        Rectangle.getNumRectangles());
    }
    public static void print( Rectangle r ){
        System.out.println( "Width = " + r.getWidth()
        + "Height = " + r.getHeight() );
        System.out.println( "The area of rectangle is "
        + r.findArea() );
        System.out.println( "The perimeter of rectangle is "
        + r.findPerimeter() );
    }
}
