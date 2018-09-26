import java.util.*;
import java.lang.*;

class a implements Runnable  {

    a () {
        Thread t = new Thread(this);
        t.start();
    }

    public void run () {
        try {
            for (int i=5; i>=0; i--) {
                System.out.println(i + " from a");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}

class b implements Runnable {
    b () {
        Thread t = new Thread(this);
        t.start();
    }

    public void run () {
        try {
            for (int i=5; i>=0; i--) {
                System.out.println(i + " from b");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}

public class thread_7 {
    public static void main(String[] args) {
        a o1 = new a();
        b o2 = new b();
        System.out.println("Bye");
    }
}