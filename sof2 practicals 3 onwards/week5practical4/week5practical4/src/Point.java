public class Point {
    
    //Point is a composite class
    public double x, y;
    private String color;

    //default constructor
    public Point(){
        x = 0.0;
        y = 0.0;
        setColor("black");
    } 
    //constructor overloading
    public Point(double x, double y){
        this.x = x;
        this.y = y;
        setColor("black");
    }
    //color getter
    public String getColor() {
        return color;
    }
    //color setter
    public void setColor(String color) {
        this.color = color;
    }
    //overriding toString method
    @Override
    public String toString() {
        String output = String.format("A Point with the color of %s and coordinates (%.2f, %.2f).", color, x, y);
        return output;
    }
    //main
    public static void main(String[] args) {
        Point dot1 = new Point(0, 0);
        Point dot2 = new Point(3, 5);
        dot2.setColor("red");
        System.out.println(dot1);
        System.out.println(dot2);
    }
}
