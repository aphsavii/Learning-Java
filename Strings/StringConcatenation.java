// Strings are immutable : Meanwhile a string variable cannot be changed further ...

public class StringConcatenation {
    public static void main(String[] args) {
        String str1 = "Avinash";
        String str2 = "Kumar";
        String str3 = str1 + " " + str2;
        System.out.println(str3);

        // charAt Function 

        System.out.println(str3.charAt(3));
    }
}
