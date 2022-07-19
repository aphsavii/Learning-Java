import java.util.Scanner;;
public class AreaOfRectengle {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the length of the rectengle : ");
    float len=input.nextFloat();
    System.out.println("Enter the width of the rectengle : ");
    float wid=input.nextFloat();
    float area=len*wid;
    System.out.println("The area of the rectengle is : "+area);
    input.close();
}
    
}
