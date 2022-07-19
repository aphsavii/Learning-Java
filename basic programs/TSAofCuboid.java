import java.util.Scanner;;

public class TSAofCuboid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the cuboid");
        float len = input.nextFloat();
        System.out.println("Enter the width of the cuboid");
        float wid = input.nextFloat();
        System.out.println("Enter the heigth of the cuboid");
        float hei = input.nextFloat();
        float TSA = 2 * (len * wid + wid * hei + len * hei);
        System.out.println("The total surface area of cuboid is :" + TSA);
        input.close();
    }
}
