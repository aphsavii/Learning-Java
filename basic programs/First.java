import java.util.Scanner;

class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World !!!");
        System.out.println("Enter the number 1 :");
        int inputA = sc.nextInt();
        System.out.println("Enter the number 2 :");
        int inputB = sc.nextInt();
        int sum = inputA + inputB;
        System.out.println("The sum is :" + sum);
        sc.close();
    }
}
