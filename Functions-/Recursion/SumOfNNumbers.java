import java.util.Scanner;

public class SumOfNNumbers {
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(sum(n));
        input.close();
    }
}
