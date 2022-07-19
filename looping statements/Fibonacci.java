import java.util.Scanner;;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the Fibonacci series :");
        int len = input.nextInt();
        int f1 = 1, f2 = 1, f3;
        System.out.println("Fibomacci Series :");
        System.out.println(f1 + "\n" + f2);
        for (int i = 2; i <= len; i++) {
            f3 = f1 + f2;
            System.out.println(f3);
            f1 = f2;
            f2 = f3;
        }
        input.close();
    }
}
