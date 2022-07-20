interface Car {
    public void start();
}

class Maruti implements Car {

    @Override
    public void start() {
        System.out.println("Maruti starts bhroom bhroom ...");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Maruti obj1 = new Maruti();
        obj1.start();
    }
}
