import java.util.*;
import java.lang.*;

class abc implements Runnable  {
    public void run () {
        System.out.println("Thread");
    }
}

public class thread_3 {
    public static void main(String[] args) {
        abc o1 = new abc();
        Thread t1 = new Thread(o1);
        t1.start();
        System.out.println("Bye");
        System.out.println(t1);
    }
}