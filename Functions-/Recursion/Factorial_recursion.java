import java.util.Scanner;

public class Factorial_recursion {
    public static int fact(int num) {
        if (num == 1 || num == 0) {
            return 1;
        } else {
            return num * fact(num - 1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to print its Factorial :");
        int num = input.nextInt();
        System.out.println(fact(num));
        input.close();
    }
}
