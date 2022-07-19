import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the radius of the circle : ");
        float rad = input.nextFloat();
        float area =((float)22/7* rad * rad);
        System.out.println("The area of Circle is : "+area);
        input.close();
    }
}
