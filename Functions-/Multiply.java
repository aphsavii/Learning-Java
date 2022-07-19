import java.util.Scanner;

public class Multiply {
    public static int product(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = input.nextInt();
        System.out.println("Enter the second number :");
        int b = input.nextInt();
        int mul = product(a, b);
        System.out.println("The product is :" + mul);
        input.close();
    }
}
