// Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.Scanner;

public class Question4 {
    public static float circumference() {
        Scanner input = new Scanner(System.in);
        float pi = (float)22 / 7;
        System.out.print("Enter the length of the radius of the Circle : ");
        float rad = input.nextFloat();
        input.close();
        return 2 * pi * rad;
    }

    public static void main(String[] args) {
        float circumference = circumference();
        System.out.println("The circumference of the Circle is :" + circumference);
    }
}
