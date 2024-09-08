public class Square extends Rectangle {
    
    //Square is a subclass of Rectangle
    //Square has no private instances

    //default constructor
    public Square(){
        super();
    }
    //constructor overloading
    public Square(double side){
        super(side, side);
    }
    //constructor overloading
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    //side getter
    public double getSide() {
        return getWidth();
    }
    //side setter
    public void setSide(double side) {
        if(side<0){
			throw new IllegalArgumentException();
		}
        setWidth(side);
        setLength(side);
    }
    //overriding setWidth method
    public void setWidth(double width) {
        if(width < 0){
			throw new IllegalArgumentException("Width must be positive");
		}
        super.setWidth(width);
        super.setLength(width);
    }
    //overriding setLength method
    public void setLength(double length) {
        if(length < 0){
			throw new IllegalArgumentException("Width must be positive");
		}
        super.setWidth(length);
        super.setLength(length);
    }
    //get area and perimeter don't require overriding as 
    //Square inherits width and length from superclass: Rectangle.
    //Both methods already exist in superclass: Rectangle

    //overriding toString method
    @Override
    public String toString() {
        String output = String.format("A Square with side = %.2f , which is a subclass of %s.", getSide(), super.toString());
        return output;
    }
    public static void main(String[] args) {
        Square cube = new Square(5);
        System.out.println(cube);
        System.out.print(cube.getArea());
    }
}
