public class Shape {

    //Shape is the superclass of Circle and Rectangle
    private String color;
    private boolean filled;

    //default constructor
    public Shape(){
        color = "red";
        filled = true;
    } 
    //constructor overloading
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    //color getter
    public String getColor() {
        return color;
    }
    //color setter
    public void setColor(String color) {
        this.color = color;
    }
    //filled getter
    public boolean isFilled() {
        return filled;
    }
    //filled setter
    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    //overriding toString method
    @Override
    public String toString() {
        String output = String.format("A Shape with the color of %s and ", color);
        output += filled?"filled.":"not filled.";
        return output;
    }
}
