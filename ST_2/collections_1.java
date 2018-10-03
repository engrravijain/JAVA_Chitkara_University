import java.util.*;
import java.lang.*;

public class collections_1 {
    public static void main(String[] args) {
        ArrayList <String> ob = new ArrayList <String> ();
        ob.add("ABC");
        ob.add("DEF");
        ob.add(2, "BC");
        System.out.println(ob);

        ArrayList ob1 = new ArrayList ();
        ob1.add("ABC");
        ob1.add("DEF");
        ob1.add(2, "BC");
        System.out.println(ob1);
        
        // traverse using for each
        for (String k: ob) {
            System.out.println(k);
        }

        for (Object k: ob) {
            System.out.println(k);
        }

        // iterate using iterator interface
        Iterator it = ob.iterator();
        while (it.hasNext()) {
            String k = (String) it.next(); // it.next() return object type
            System.out.println(k);
        }

        ob.add(3, "3");

        System.out.println(ob);
        ob.remove(2); // works
        // ob.remove(5); // index out of bound
        System.out.println(ob);
        ob.remove("ABC");
        System.out.println(ob);
        ob.remove("zzz"); // does nothing if not present
        System.out.println(ob);

    }
}