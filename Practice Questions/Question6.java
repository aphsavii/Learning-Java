// Write a program to input 10 numbers and print all the prime numbers 

import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            if (arr[i] <=1) {
                temp = 1;
            }
            if(arr[i]>1) {
                for (int j = 2; j <= arr[i] / 2; j++) {
                    if (arr[i] % j == 0) {
                        temp = 1;
                        break;
                    }
                }
            }
            if (temp == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
