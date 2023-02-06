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

//overriding example with Disc Subclass
public class Disc extends Circle {
    private double thickness ;
    public Disc() { super() ; thickness = 0 ; }
    public Disc( double xCoor , double yCoor , double rad , double t ) {
        super( xCoor , yCoor , rad ) ;
        thickness = t ;
    }
    public double getThickness() { return thickness ; }
    public double findArea() {
        return 2 * super.findArea() + 2 * Math.PI * getRadius() * thickness ;
    }
    public double findVolume() {
        return super.findArea() * thickness ;
    }
    public void print() {
        System.out.println( "Disc print() method: " );
        super.print();
        System.out.println( "Radius = " + getRadius() );
        System.out.println( "Thickness = " + thickness );
        System.out.println( "Area = " + findArea() );
        System.out.println( "Volume = " + findVolume() );
    }
}

//testing disc app
public class DiscApp {
    public static void main( String[] args ) {
        Circle circ = new Circle( 1 , 5 , 10 );
        Disc disc = new Disc( 10 , 20 , 5 , 10 );
        circ.print() ;
        disc.print() ;
        System.out.println( "Volume = " + disc.findVolume() );
        System.out.println( "XPos = " + circ.getXPos() + " YPos = " + circ.getYPos() );
        System.out.println( "XPos = " + disc.getXPos() + " YPos = " + disc.getYPos() );
    }
}
