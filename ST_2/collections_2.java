import java.util.*;
import java.lang.*;

public class collections_2 {
    public static void main(String[] args) {
        ArrayList <Integer> ob = new ArrayList <Integer> ();
        ob.add(new Integer(101));
        ob.add(102);
        ob.add(2, 103);
        System.out.println(ob);
        ob.remove(2); // delete index 2
        System.out.println(ob);
        ob.set(1, 501);
        System.out.println(ob.get(0));
        System.out.println(ob);
        System.out.print("Index of 501: " + ob.indexOf(501) + "\n");
        System.out.println(ob.contains(102));
        System.out.print("Size: " + ob.size() + "\n");
        ob.add(-52);
        System.out.println(ob);
        Collections.sort(ob);
        System.out.println(ob);
        Collections.sort(ob, Collections.reverseOrder());
        System.out.println(ob);
    }
}