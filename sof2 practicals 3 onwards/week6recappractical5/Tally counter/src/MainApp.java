public class MainApp {
    public static void main(String[] args) throws Exception {
        TallyCounter tallyCount = new TallyCounter(4);
        for(int i = 1; i < 100; i++){
            tallyCount.increment();
            System.out.println(tallyCount);
        }
        System.out.println(tallyCount.read());
        //tallyCount.reset();
        //System.out.println(tallyCount.read());

        for(int i = 1; i < 102; i++){
            tallyCount.decrement();
            System.out.println(tallyCount);
        }
        System.out.println(tallyCount.read());
        tallyCount.reset();
        System.out.println(tallyCount.read());
    }
}
