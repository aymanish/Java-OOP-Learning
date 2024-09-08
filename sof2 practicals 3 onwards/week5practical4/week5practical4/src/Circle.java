public class Circle extends Shape {
    
    //Circle is a subclass of Shape
    private double radius;

    //default constructor
    public Circle(){
        radius = 1.0;
    }
    //constructor overloading
    public Circle(double radius){
        setRadius(radius);
    }
    //constructor overloading
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        setRadius(radius);
    }
    //radius getter
    public double getRadius() {
        return radius;
    }
    //radius setter
    public void setRadius(double radius) {
        if(radius < 0){
			throw new IllegalArgumentException("Radius must be positive");
		}
        this.radius = radius;
    }
    //get area
    public double getArea() {
        double area = Math.PI*(Math.pow(radius, 2));
        return area;
    }
    // get perimeter
    public double getPerimeter() {
        double perimeter = 2*Math.PI*radius;
        return perimeter;
    }
    //overriding toString method
    @Override
    public String toString() {
        String output = String.format("A Circle with radius = %.2f, which is a subclass of %s.", radius, super.toString());
        return output;
    }
}
