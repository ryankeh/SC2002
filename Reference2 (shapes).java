//Superclass: Shape class
public class Shape {
    private double xPos ;
    private double yPos ;
    public Shape() {
        xPos = 0 ;
        yPos = 0 ;
    }
    public Shape( double xCoor , double yCoor ) {
        xPos = xCoor ;
        yPos = yCoor ;
    }
    public double getXPos() { return xPos ; }
    public double getYPos() { return yPos ; }
    public void print() {
        System.out.println( "[x, y] = [" + xPos
        + ", " + yPos + "]");
    }
}

//Subclass: Rectangle class
public class Rectangle extends Shape {
    private double width ;
    private double height ;
    public Rectangle() {
        super() ;
        width = 0 ;
        height = 0 ;
    }
    public Rectangle( double xCoor, double yCoor, double w, double h ) {
        super( xCoor , yCoor );
        width = w ;
        height = h ;
    }
    public double getWidth() { return width ; }
    public double getHeight() { return height ; }
    public double findPerimeter() { return 2*(width+height) ; }
    public double findArea() { return width * height ; }
    public void print() {
        System.out.println( "Rectangle print() method: " );
        System.out.print( "Center " );
        super.print();
        System.out.println( "Width = " + width
        + ";Height = " + height );
        System.out.println( "Perimeter = " + findPerimeter() );
        System.out.println( "Area = " + findArea() );
    }
}

//Subclass: Circle class
public class Circle extends Shape {
    private double radius ;
    public Circle() {
        super() ;
        radius = 0 ;
    }
    public Circle( double xCoor , double yCoor , double rad ) {
        super( xCoor , yCoor );
        radius = rad ;
    }
    public double getRadius() { return radius; }
    public double findPerimeter() { return 2*Math.PI*radius; }
    public double findArea() { return Math.PI*radius*radius; }
    public void print() {
        System.out.println( "Circle print() method: " );
        System.out.print( "Center " );
        super.print();
        System.out.println( "Radius = " + radius );
        System.out.println( "Perimeter = " + findPerimeter() );
        System.out.println( "Area = " + findArea() );
    }
}

//application class
public class ShapesApp {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle( 5 , 5 , 10 , 10 ) ;
        System.out.print( "Rectangle: " );
        System.out.println( "Center Coordinates [x, y] = [" + rect.getXPos() + ", "+ rect.getYPos() + "]" );
        System.out.println( "Width = " + rect.getWidth() + "; Height = " + rect.getHeight() );
        System.out.println( "Perimeter = " + rect.findPerimeter() );
        System.out.println( "Area = " + rect.findArea() );
        rect.print();
        Circle circ = new Circle( 5 , 10 , 5 );
        System.out.print( "Circle: " );
        System.out.println( "Center Coordinates [x, y] = [" + circ.getXPos() + ", " + circ.getYPos() + "]" );
        System.out.println( "Radius = " + circ.getRadius() );
        System.out.println( "Perimeter = " + circ.findPerimeter() );
        System.out.println( "Area = " + circ.findArea() );
        circ.print();
    }
}
