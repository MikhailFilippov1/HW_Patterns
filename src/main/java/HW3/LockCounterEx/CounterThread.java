package HW3.LockCounterEx;

class CounterThread extends Thread {
    private LockCounterExample counter;

    public CounterThread(LockCounterExample counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.incrementCounter();
        }
    }
}
