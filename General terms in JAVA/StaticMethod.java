class Person {
    public void speak() {
        System.out.println("Person speaks ...");
    }
}

class Teacher extends Person {
    public static void speaks() {
        System.out.println("Teacher speaks ...");
    }

    public void speak() {
        System.out.println("Teacher teaches");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.speak();
        Person obj1 = new Teacher();
        obj1.speak();
        Teacher.speaks();
    }
}
