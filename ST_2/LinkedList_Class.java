// using collections
import java.util.*;
import java.lang.*;

public class LinkedList_Class {
    public static void main(String[] args) {
        LinkedList <String> ll = new LinkedList <String> ();
        ll.add("a");
        ll.add("a");
        ll.addFirst("aa");
        ll.addLast("zz");
        ll.add(2, "cc");
        ll.add("a");
        ll.add("a");
        ll.add("a");
        ll.add("a");
        ll.set(1, "set");
        ll.remove("a"); //remove all occurences of a not true
        System.out.print("get operation: " + ll.get(2) + "\n");
        System.out.println(ll);
    }
}