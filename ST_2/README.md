# Multitasking

1. Process based
    A program in  execution is a process

2. Thread based

    **Thread**

    small units of a big program are called threads. run threads which belong to same process. light weight process.

    methods to do threading

    1. Thread class

        ```java
        class a extends Thread {

        }
        ```
    2. Runnable interface

    ```java
    class a implements Runnable {

    }
    ```

    lifecycle of thread also applet, servlet

    **start() => run() => destroy()**
    **Ready to Run => running state => dead**

    it can either move to blocked waiting or sleeping state and goes back to running state using method **notify()**.

    when we call a **run()** method directly from main then o1 and o2 are threated as normal thread and not oobject so there is no context switching.