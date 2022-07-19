import java.util.Scanner;

public class TSAofSphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the radius of the sphere :");
        float rad = input.nextFloat();
        float TSA = (float) (4 * 3.14 * rad * rad);
        System.out.println("the TSA of the sphere is : "+TSA);
        input.close();
    }
}
