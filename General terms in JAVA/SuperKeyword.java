class Superclass {
    int a = 1;

    public void display() {
        System.out.println("Sameer suman is very chutiya insaan");
    }
}

class Subclass extends Superclass {
    int a = 2;

    public void display() {
        System.out.println("Sameer suman is very achha insaan");
    }

    public void print() {
        System.out.println("value of superclass a" + super.a);
        System.out.println("value of subclass a" + a);
        super.display();
        display();
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.print();
    }
}
