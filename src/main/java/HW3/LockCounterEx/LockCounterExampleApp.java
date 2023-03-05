package HW3.LockCounterEx;

public class LockCounterExampleApp {
    public static void main(String[] args) throws InterruptedException {
        LockCounterExample lockCounter = new LockCounterExample();

        for(int i=0; i<20; i++) {
            CounterThread ct = new CounterThread(lockCounter);
            ct.start();
        }
        Thread.sleep(1000);
        System.out.println("Counter:" + lockCounter.getCounter());
    }
}
