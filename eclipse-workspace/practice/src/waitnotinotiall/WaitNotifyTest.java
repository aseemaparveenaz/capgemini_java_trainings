package waitnotinotiall;

public class WaitNotifyTest {

    public static void main(String[] args) {
        Message msg = new Message("please wait........");
        Waiter waiter = new Waiter(msg);
        new Thread(waiter,"Thread1").start();
        
        Waiter waiter1 = new Waiter(msg);
        new Thread(waiter1, "Thread2").start();
        
        Notifier notifier = new Notifier(msg);
        new Thread(notifier, "notifier").start();
       
    }

}