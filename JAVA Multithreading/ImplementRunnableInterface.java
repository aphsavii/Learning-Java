class Runnable1 implements Runnable {
    public void run() {
        System.out.println("I am Thread1 ...");
        System.out.println("I am Thread1 ...");
        System.out.println("I am Thread1 ...");
        System.out.println("I am Thread1 ...");
        System.out.println("I am Thread1 ...");
        System.out.println("I am Thread1 ...");
        System.out.println("I am Thread1 ...");
        System.out.println("I am Thread1 ...");
        System.out.println("I am Thread1 ...");
        System.out.println("I am Thread1 ...");

    }
}

class Runnable2 implements Runnable {
    public void run() {
        System.out.println("I am Thread2 ...");
        System.out.println("I am Thread2 ...");
        System.out.println("I am Thread2 ...");
        System.out.println("I am Thread2 ...");
        System.out.println("I am Thread2 ...");
        System.out.println("I am Thread2 ...");
        System.out.println("I am Thread2 ...");
        System.out.println("I am Thread2 ...");
        System.out.println("I am Thread2 ...");
        System.out.println("I am Thread2 ...");
        System.out.println("I am Thread2 ...");
    }
}

public class ImplementRunnableInterface {
    public static void main(String[] args) {
        Runnable1 obj1 = new Runnable1();
        Thread t1 = new Thread(obj1);

        Runnable2 obj2 = new Runnable2();
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}