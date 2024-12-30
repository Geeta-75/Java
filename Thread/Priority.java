package Thread;

public class Priority  extends Thread{
    public void run() {
        System.out.println("Child Thread");
        System.out.println("Child Thread Priority : " + Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        System.out.println("Main Thread Old Priority : " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("Main Thread New Priority : " + Thread.currentThread().getPriority());
        Priority p = new Priority();
        p.start();
        //p.setPriority(5);
    }
}
