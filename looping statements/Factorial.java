import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to print its factorial :");
        int num = input.nextInt();
        input.close();
        int count = 1;
        for (int i = 1; i <= num; i++) {
            count = count * i;
        }
        System.out.println("Factorial of " + num + " = " + count);
    }

}
