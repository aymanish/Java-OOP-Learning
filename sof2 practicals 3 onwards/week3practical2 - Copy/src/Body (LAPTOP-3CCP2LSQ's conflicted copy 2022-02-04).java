import java.awt.Color;

public class Body {

    //global constants
    private static final double G = 6.673e-11;
    private static final double solarmass = 1.98892e30;

    //properties
    public double rx, ry; //cartesian positions
    public double vx, vy; // velocity
    public double fx, fy; //force
    public double mass; //mass
    public Color color; //color

    //body constructor:
    public Body(double rx, double ry, 
                double vx, double vy, 
                double fx, double fy, 
                double mass, Color color) {
                    this.rx = rx;
                    this.ry = ry;
                    this.vx = vx;
                    this.vy = vy;
                    this.fx = fx;
                    this.fy = fy;
                    this.mass = mass;
                    this.color = color;
                }

    //update velocity and position using a timestep
    public void update(double timestep) {
        // velocity = force x time / mass
        vx += timestep*fx / mass;
        vy += timestep*fy / mass;
        // distance = velocity x time
        rx = vx*timestep;
        ry = vy*timestep;
    }

    //return the distance between 2  bodies:
    public double distanceTo(Body otherBody) {
        double dx = rx - otherBody.rx;
        double dy = ry - otherBody.ry;
        // c = sqrt(a**2 + b**2)
        return Math.sqrt(dx*dx + dy*dy);
    }

    //set force to zero:
    public void resetForce() {
        fx = 0.0;
        fy = 0.0;
    }

    // compute the net force acting between the body a and b, and
    // add to the net force acting on a
    public void addForce(Body b) {
        Body a = this;
        double EPS = 3E4;      // softening parameter (just to avoid infinities)
        double dx = b.rx - a.rx;
        double dy = b.ry - a.ry;
        double dist = Math.sqrt(dx*dx + dy*dy);
        double F = (G * a.mass * b.mass) / (dist*dist + EPS*EPS);
        a.fx += F * dx / dist;
        a.fy += F * dy / dist;
    }

    // convert to string representation formatted nicely
    public String toString() {
        return "" + rx + ", "+ ry+ ", "+  vx+ ", "+ vy+ ", "+ mass;
    }
}