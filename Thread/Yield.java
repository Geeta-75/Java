package Thread;

public class Yield extends Thread {
    public void run () {
        Thread.yield();
        for(int i = 1 ; i <= 5 ; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
    public static void main(String[] args) {
        Yield y = new Yield();
        y.start();
        
        for(int i = 1 ; i <= 5 ; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            System.out.println("Main Thread");
        }
    }
}
