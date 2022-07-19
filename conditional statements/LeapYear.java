import java.util.Scanner;;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int year=input.nextInt();
        if (year%400==0) {
            System.out.println("The year "+year+" is a Leap year ...");
        }
        else if(year%100==0){
            System.out.println("The year "+year+" is a not Leap year ...");
        }
        else if (year%4==0) {
            System.out.println("The year "+year+" is a Leap year ...");
        }
        else{
            System.out.println("The year "+year+" not is a Leap year ...");
        }
        input.close();
    }
}
