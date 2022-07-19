import java.util.Scanner;

public class fibonacci_recursion {
    public static void fibonacci(int term, int prvNum, int num) {
        int nextnum;
        if (term == 0) {
            return;
        } else {
            nextnum = prvNum + num;
            prvNum = num;
            num = nextnum;
            System.out.println(nextnum);
            term--;
            fibonacci(term, prvNum, num);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int prvNum = 0;
        int num = 1;
        int term = input.nextInt();
        System.out.println(1);
        fibonacci(term, prvNum, num);
        input.close();
    }
}
