package HW3.LockCounterEx;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockCounterExample {
    private Lock l = new ReentrantLock();
    private int count = 0;

    public void incrementCounter(){
        l.lock();
        try {
            ++ count;
        }finally {
            l.unlock();
        }
    }

    public long getCounter() {
        return count;
    }
}

