package HW3.WaitNotifyExample;

public class PingPong {
    boolean flag = false;
    synchronized void ping() throws InterruptedException {
        while (!flag){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Pong!");
        Thread.sleep(1000);
        flag = false;
        notify();
    }
    synchronized void pong() throws InterruptedException {
        while (flag) {
            try {
                wait();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Ping!");
        Thread.sleep(1000);
        flag = true;
        notify();
    }
}

