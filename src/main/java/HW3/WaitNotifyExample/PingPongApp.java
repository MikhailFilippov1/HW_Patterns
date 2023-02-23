package HW3.WaitNotifyExample;

public class PingPongApp {
    public static void main(String[] args) {
        PingPong q = new PingPong();
        new Player1(q);
        new Player2(q);
    }
}
