# Collections

the collection framework has 7 core interface with collection interface at the root of collection herarichy.

collection results in three interface. collection is derived from object. collection is an interface as well as a class.

1. Set (interface)
    - sorted Set (interface)
        - TreeSet (class)
    - HashSet (class)
    - LinkedHashSet (class)
2. Queue (interface)
    - LinkedList (class)
    - Priority Queue (class)
3. List (interface)
    - ArrayList (class)
    - LinkedList (class)
    - Vector (class)

Not derived from collection

1. Map (interface)
    - Sorted map (interface)
        - TreeMap (class)
    - Hashtable (class)
    - HashMap (class)
    - LinkedHashMap (class)

there are three other utility operations and these all are in the java.util.* package

1. comparator
2. iterator
3. enumrator

## List Interface

1. **Create an array list**

    Interface object = new abc(); // true

    ```java
    ArrayList <string> ob = new ArrayList <string> ();
    ob.add("ABC"); // by default at end
    ob.add(2, "BC"); // insert at 2nd index
    System.out.print(ob);
    ```

2. **Iterate over ArrayList**

    ```java
    for (String k: ob)
        System.out.println(k);
    ```

    ```java
    Iterator it = ob.Iterator();
    while (it.hasNext()) {
        String k = (String) it.next(); // it.next() return object type
        System.out.print(k);
    }
    ```

3. **Delete an Element**

    ```java
    ob.remove(3);
    ob.remove("AB");
    ```

4. **Update**

    ```java
    ob.set(2, "new");
    ob.set(2, 20);
    ```

5. **get**

    ```java
    ob.get(2);
    ```

6. **indefOf**

    ```java
    ob.indexOf("value whose index is to be found");
    // return index if present else -1
    ```

7. **Contains**

    ```java
    ob.contains("value whose index is to be found");
    // return true or false
    ```
8. **Size**

    ```java
    ob.size();
    ```

9. **Sort**

    ```java
    collections.sort(ob);
    ```

10. **Reverse**
    ```java
    Collections.sort(ob, Collections.reverseOrder());
    ```

## LinkedList

uses doubly linked list

1. ll.add("a");
2. ll.addFirst("aa");
3. ll.addLast("zz");
4. ll.add(2, "cc");
5. ll.set(1, "set");
6. ll.indexOf();
7. ll.lastIndexOf();
8. ll.remove(); // removes first element
9. ll.remove(6); // remove at 6 index
10. ll.remove("a"); // remove if found
11. ll.removeFirst();
12. ll.removeLast();
13. ll.removeFirstOccurence();

## ArrayList Vs. LinkedList

1. Search Complexity

    O(1) Vs. O(n)

2. Deletion

    O(n) Vs. O(1)

3. Insertion

    O(n) Vs. O(1)

4. Memory Overhead

    Index and element Vs. element and two pointers