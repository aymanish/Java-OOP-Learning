package tool.counter;

public class BasicTallyCounter implements ITallyCounter {
    public int counter, digits;

    //default constructor
    public BasicTallyCounter(){
        counter = 0;
        digits = 3;
    }

    //constructor overloading
    public BasicTallyCounter(int digits) throws Exception {
        if(digits < 3){
            throw new Exception("Digit cannot be lower than 3!");
        }
        counter = 0;
        this.digits = digits;
    }


    // increment counter method
    @Override
    public int increment() throws InvalidOperationException {
        int old = counter;
        if(counter == (int) Math.pow(10, digits) - 1){
            throw new InvalidOperationException("Counter has reached limit.");
        }else{
            counter ++;
        }
        return old;
    }

    @Override
    public int read() {
        return counter;
    }
    //reset counter
    @Override
    public int reset() {
        int old = counter;
        counter = 0;
        return old;
    }

    //toString method
    public String toString() {
        String template = "%0";
        template += digits + "d";
        return String.format(template, counter);
    }
}
