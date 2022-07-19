// Strings are immutable : Meanwhile a string variable cannot be changed further ...

import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "Avinash Kumar";
        System.out.println(str);

        // String Input
        // To take a single word as an input we use input.next();
        // String str2 = input.next();
        // System.out.println(str2);

        // To take a full line as an input we use input.nextline();
        System.out.println("Hey there !!");
        String str3 = input.nextLine();
        System.out.println(str3);
        System.out.println("Hey there !!");

        input.close();
    }
}
