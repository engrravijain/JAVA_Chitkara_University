import java.util.*;
import java.lang.*;

class abc implements Runnable  {

    abc () {
        Thread t = new Thread(this);
        t.start();
    }

    public void run () {
        try {
            for (int i=5; i>=0; i--) {
                System.out.println(i);
                // Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}

public class thread_6 {
    public static void main(String[] args) {
        abc o1 = new abc();
        abc o2 = new abc();
        System.out.println("Bye");
    }
}