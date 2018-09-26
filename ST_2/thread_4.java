import java.util.*;
import java.lang.*;

class abc implements Runnable  {

    abc () {
        Thread t = new Thread(this);
        t.start();
    }

    public void run () {
        System.out.println("Thread");
    }
}

public class thread_4 {
    public static void main(String[] args) {
        abc o1 = new abc();
        System.out.println("Bye");
    }
}