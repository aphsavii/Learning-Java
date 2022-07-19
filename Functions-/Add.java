import java.util.Scanner;;

public class Add {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first Number :");
        int a = input.nextInt();
        System.out.println("Enter the second Number :");
        int b = input.nextInt();
        int sum = sum(a, b);
        System.out.println("The sum is :" + sum);
        input.close();
    }
}
