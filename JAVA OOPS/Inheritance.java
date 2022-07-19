class Base1 {
    Base1() {
        System.out.println("This is base class  Constructor");
    }

    Base1(int a) {
        System.out.println("The value of a is :" + a);
    }

    // public int a = 5;
}

class Derived1 extends Base1 {
    Derived1(int a) {
        super(a);
        System.out.println("THis is derived class constructor");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Base1 obj=new Base1();
        Derived1 obj = new Derived1(4);
        // System.out.println(obj.a);
    }
}
