package threads;

public class Loader extends Thread {

    public void run() {
        System.out.println("Hello");
    }
}

class MyClass {
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(new Loader());

        Thread.sleep(4000);
        t.start();
        RunMethod obj2 = new RunMethod();
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj2.start();
    }
}
