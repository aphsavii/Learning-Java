import java.util.Scanner;

public class CalculatePower {
    public static int power(int base, int expo) {
        if (expo == 0) {
            return 1;
        }
        return base * power(base, expo - 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ente the base value :");
        int base = input.nextInt();
        System.out.print("Ente the exponent value :");
        int expo = input.nextInt();
        System.out.println(power(base, expo));
        input.close();
    }
}
