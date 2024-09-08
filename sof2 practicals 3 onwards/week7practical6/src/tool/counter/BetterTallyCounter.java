package tool.counter;

import java.util.ArrayList;

public class BetterTallyCounter extends BasicTallyCounter implements IAdvancedCounter{

    //default constructor
    public BetterTallyCounter(){
        super();
    }
    //constructor overloading
    public BetterTallyCounter (int digits) throws Exception {
        super(digits);
    }
    //decrement read() method
    @Override
    public int decrement() throws InvalidOperationException {
        if(counter == 0){
            throw new InvalidOperationException("Counter cannot go lower than limit.");
        }else{
            int old = counter;
            counter --;
            return old;
        }
    }
    //main
    public static void main(String[] args) throws InvalidOperationException {
        ArrayList <ITallyCounter> tallyList = new ArrayList<ITallyCounter>(2);
        BasicTallyCounter basic = new BasicTallyCounter();
        BetterTallyCounter better = new BetterTallyCounter();

        basic.increment();
        basic.increment();
        basic.increment();
        System.out.println(basic);

        better.increment();
        better.increment();
        System.out.println(better);

        tallyList.add(0, basic);
        tallyList.add(1, better);

        int sum = 0;
        for (ITallyCounter i:tallyList){
            sum += i.read();
        }
        System.out.println(sum);

        }
}
