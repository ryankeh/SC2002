public abstract class Figure{
    private String color;
    public Figure() { color = "black"; }
    public Figure( String c ) { this.color = c; }
    public String getColor() { return color; }
    
    // abstract methods - no method body
    public abstract double findArea() ;
    public abstract double findPerimeter() ;
    public abstract void print() ;
}

public class Rectangle extends Figure {
    private double width ;
    private double height ;
    public Rectangle() { super() ; this.width = 0 ; this.height = 0 ; }
    public Rectangle( String c , double w , double h ) { super( c ) ; this.width = w ; this.height = h ; }
    public double getWidth() { return width ; }
    public double getHeight() { return height ; }
    
    // implementation of the abstract methods
    public double findArea() { return width * height ; }
    public double findPerimeter() { return 2*(width+height) ; }
    public void print() {
        System.out.println( "Rectangle print() method: " );
        System.out.println( "Width = " + width
        + "; Height = " + height );
        System.out.println( "Perimeter = " + findPerimeter() );
        System.out.println( "Area = " + findArea() );
    }
}

public class Circle extends Figure{
    private double radius;
    public Circle() { super() ; this.radius = 0 ; }
    public Circle( String c , double rad ) { super(c) ; this.radius = rad ; }
    public double getRadius() { return radius; }
    
    // implementation of the abstract methods
    public double findArea() { return Math.PI * radius * radius ; }
    public double findPerimeter() { return 2 * Math.PI * radius ; }
    public void print() {
        System.out.println( "Circle print() method: " );
        System.out.println( "Radius = " + radius );
        System.out.println( "Perimeter = " + findPerimeter() );
        System.out.println( "Area = " + findArea() );
    }
}

//testing figure abstract class
public class FigureApp {
    public static void main( String[] args ) {
        Rectangle rect = new Rectangle( "Red" , 10 , 10 );
        System.out.println( "Rectangle: " );
        System.out.println( "Color : " + rect.getColor() );
        System.out.println( "Width = " + rect.getWidth() );
        System.out.println( "Height = " + rect.getHeight () );
        System.out.println( "Perimeter = " + rect.findPerimeter() );
        System.out.println( "Area = " + rect.findArea() );
        rect.print();
        System.out.println();
        
        Circle circ = new Circle( "Orange" , 5 );
        System.out.println( "Circle: " );
        System.out.println( "Color : " + circ.getColor() );
        System.out.println( "Radius = " + circ.getRadius() );
        System.out.println( "Perimeter = " + circ.findPerimeter() );
        System.out.println( "Area = " + circ.findArea() );
        circ.print();
    }
}
