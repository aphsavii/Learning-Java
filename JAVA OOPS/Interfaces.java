interface Car {
    public void start();
}

class Maruti implements Car {

    @Override
    public void start() {
        System.out.println("Maruti starts bhroom bhroom ...");
    }
}

class Swift extends Maruti {

    @Override
    public void start() {
        System.out.println("Swift starts bhroom bhroom ...");
    }
}

interface SuperCar extends Car {
    // By using default keyword we can implement the mehtod in the interface itself
    // ...
    default public void race() {
        System.out.println("It's a racing Car !! wohooo ...");
    }
}

class Ferrari implements SuperCar {
    @Override
    public void start() {
        System.out.println("Ferrrai started !! Time to race ...");
    }
}

interface SUV {
    default public void BigCar() {
        System.out.println("Ohhh it has a large legroom as well as it's a 7 seater ...");
    }

}

interface Lamborghini extends SUV, SuperCar {
    public void offRoading();
}

class Urus implements Lamborghini {
    @Override
    public void start() {
        System.out.println("Yeah time to ride Lamborgini Urus !!");
    }

    @Override
    public void offRoading() {
        System.out.println("Hurray !! We are gonna go Off road ... Time to experience some Adventure !!!");
    }
}

interface Test {
    public static void runTest() {
        System.out.println("This is a static method inside an interface ...");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        // Car interface

        Maruti maruticar = new Maruti();
        Swift swiftcar = new Swift();
        maruticar.start();
        swiftcar.start();

        // Supercar interface
        Ferrari ferrari_roma = new Ferrari();
        ferrari_roma.start();
        ferrari_roma.race();

        // Acheveing Multiple inheritance through Interfaces
        Urus myurus = new Urus();
        myurus.start();
        myurus.race();
        myurus.offRoading();

        // Static method in interface
        Test.runTest();
    }
}
