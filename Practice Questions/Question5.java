// Write a function that calculates the Greatest Common Divisor of 2 numbers.

import java.util.Scanner;

public class Question5 {
    public static int gcd(int num1, int num2) {
        int count = 0;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                count = i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first Number :");
        int num1 = input.nextInt();
        System.out.print("Enter the second Number :");
        int num2 = input.nextInt();
        int gcd = gcd(num1, num2);
        System.out.println("The GCD is :" + gcd);
        input.close();
    }
}


// Alternative Code 

// import java.util.*;
 
// public class Sample {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
 
//        while(n1 != n2) { 
//            if(n1>n2) {
//                n1 = n1 - n2;
//            } else {
//                n2 = n2 - n1;
//            }
//        }
//        System.out.println("GCD is : "+ n2);
//    }   
// }
 
