public class Rectangle extends Shape {

    //Rectangle is a subclass of Shape
    private double width, length;

    //default constructor
    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }
    //constructor overloading
    public Rectangle(double width, double length){
        setWidth(width);
        setLength(length);
    }
    //constructor overloading
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        setWidth(width);
        setLength(length);
    }
    //width getter
        public double getWidth() {
        return width;
    }
    //length getter
    public double getLength() {
        return length;
    }
    //width setter
    public void setWidth(double width) {
        if(width < 0){
			throw new IllegalArgumentException("Width must be positive");
		}
        this.width = width;
    }
    //length setter
    public void setLength(double length) {
        if(length < 0){
			throw new IllegalArgumentException("Length must be positive");
		}
        this.length = length;
    }
    //get area
    public double getArea() {
        double area = width*length;
        return area;
    }
    // get perimeter
    public double getPerimeter() {
        double perimeter = 2*(width + length);
        return perimeter;
    }
    //overriding toString method
    @Override
    public String toString() {
        String output = String.format("A Rectangle with width = %.2f and length = %.2f, which is a subclass of %s.", width, length, super.toString());
        return output;
    }
}
