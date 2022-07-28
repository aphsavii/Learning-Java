// Acheving Multithreading by extending the thread class 

class First extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("I am First class ...");
        }
    }
}

class Second extends Thread {
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("I am Second class ...");
        }
    }
}

public class ThreadClassextend {
    public static void main(String[] args) {
        First obj1 = new First();
        Second obj2 = new Second();
        obj1.start();
        obj2.start();
    }
}
