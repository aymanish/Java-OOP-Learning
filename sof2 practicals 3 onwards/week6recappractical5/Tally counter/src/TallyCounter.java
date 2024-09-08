public class TallyCounter {
    private int counter, digits;

    //default constructor
    public TallyCounter(){
        counter = 0;
        digits = 3;
    }
    //constructor overloading
    public TallyCounter(int digits) throws Exception {
        if(digits < 3){
            throw new Exception("Digit cannot be lower than 3!");
        }
        counter = 0;
        this.digits = digits;
    }
    //overriding toString method
    @Override
    public String toString() {
        String template = "%0";
        template += digits + "d";
        return String.format(template, counter);
    }
    // increment counter method
    public void increment() {
        if(counter == (int) Math.pow(10, digits) - 1){
            counter = 0;
        }else{
            counter ++;
        }
    }
    //decrement counter method
    public void decrement() {
        if(counter == 0){
            counter = 0;
        }else{
            counter --;
        }
    }
    // count getter
    public int read() {
        return counter;
    }
    //reset counter
    public void reset() {
        counter = 0;
    }
}
