package HW3.WaitNotifyExample;

class Player1 implements Runnable{
    PingPong q;
    public Player1(PingPong q){
        this.q = q;
        new Thread(this, "Player1").start();
    }
    @Override
    public void run() {
        while (true){
            try {
                q.ping();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Player2 implements Runnable{
    PingPong q;
    public Player2(PingPong q){
        this.q = q;
        new Thread(this, "Player2").start();
    }
    @Override
    public void run() {
        while (true){
            try {
                q.pong();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

