public class Line {

    //Line has a composite class: Point
    private Point start, end;
    private String color;

    //constructor
    public Line(Point start, Point end){
        setStart(start);
        setEnd(end);
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
    //start getter
    public Point getStart() {
        return start;
    }
    //start setter
    public void setStart(Point start) {
        if(start == null){
			throw new IllegalArgumentException();
		}
        this.start = start;
    }
    //end getter
    public Point getEnd() {
        return end;
    }
    //end setter
    public void setEnd(Point end) {
        if(end == null){
			throw new IllegalArgumentException();
		}
        this.end = end;
    }
    //length getter
    public double getLength() {
        double a = end.x - start.x;
        double b = end.y - start.y;
        double length = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return length;
    }
    //overriding toString method
    @Override
    public String toString() {
        String output = String.format("A Line with the color of %s, start coordinates (%.2f, %.2f) and end coordinates (%.2f, %.2f).", color, start.x, start.y, end.x, end.y);
        return output;
    }
    public static void main(String[] args) {
        Point dot1 = new Point(0, 0);
        Point dot2 = new Point(3, 5);
        Line line1 = new Line(dot1, dot2);
        System.out.println(line1);
    }
}
