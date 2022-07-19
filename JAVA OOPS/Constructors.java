public class Constructors {
    private String name;

    Constructors() {
        name = "Avinash";
        System.out.println("Hello World !!");
    }

    public static void main(String[] args) {
        Constructors obj = new Constructors();
        System.out.println(obj.name);
    }
}
