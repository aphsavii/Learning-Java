// Strings are immutable : Meanwhile a string variable cannot be changed further ...

public class Substring {
    public static void main(String[] args) {
        String str = "Avinash Kumar";

        // The substring Function takes two arguments i.e the begining index and the
        // ending index .
        // Note : the ending index should be 1 more than the actual index

        String str2 = str.substring(8, str.length());
        System.out.println(str2);
    }
}
