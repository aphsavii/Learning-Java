// Strings are immutable : Meanwhile a string variable cannot be changed further ...

public class stringComparison {
    public static void main(String[] args) {
        String str1 = "Avinash";
        String str2 = "Avinash";

        // compareTo Function : The string whose first character is bigger than the
        // other string will be bigger.If its same than the next charcter will be
        // compared and so on.

        // s1 > s2 : will return a +ve value
        // s1 = s2 : will return 0
        // s1 < s2 : will return a -ve value

        System.out.println(str1.compareTo(str2));
    }
}
