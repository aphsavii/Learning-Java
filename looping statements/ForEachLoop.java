// In Java, the for-each loop is used to iterate through elements of arrays and collections (like ArrayList). It is also known as the enhanced for loop.

import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        input.close();
        for (int data : arr) {
            System.out.println(data);
        }
    }
}
