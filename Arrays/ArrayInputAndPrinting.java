import java.util.Scanner;

public class ArrayInputAndPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array declaration
        int[] arr = new int[10];

        // Array input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        input.close();

        // Array printing
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
