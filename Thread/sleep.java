package Thread;
public class sleep extends Thread {
    public void run () {

        System.out.println("Sleep Method");
        for(int i = 1; i <= 5 ; i++){
            try {
                Thread.sleep(1000);
                System.out.println(i);
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        sleep s = new sleep();
        s.start();
    }
}
