package Thread;
    // Single task to Single Thread
public class Task extends Thread {
    public void run () {
        System.out.println("Thread Task");
    }
    public static void main(String[] args) {
        Task t = new Task();
        t.start();
    }
}

 class Task2 extends Thread {
      public void run () {
        System.out.println("Thread task 2");
      }
      public static void main(String[] args) {
        Task2 t = new Task2();
        t.start();
        Task2 t2 = new Task2();
        t.start();
      }
}
