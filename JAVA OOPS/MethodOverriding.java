class Animal {
    public void display() {
        System.out.println("I am an Animal ...");
    }
}

class Dog extends Animal {
    @Override
    public void display() {
        System.out.println("I am a Dog ...");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal obj1 = new Animal();
        Dog obj2 = new Dog();
        obj1.display();
        obj2.display();
    }
}
