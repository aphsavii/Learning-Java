public class MethodOverloading {
    public static void sum(int a, int b) {
        System.out.println("sum is :" + (a + b));
    }

    public static void sum(int a, int b, int c) {
        System.out.println("Sum is:" + (a + b + c));
    }

    public static void main(String[] args) {
        sum(1, 2, 3);
        sum(3, 4);
    }
}
