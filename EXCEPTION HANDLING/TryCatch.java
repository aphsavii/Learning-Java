// For each try block, there can be zero or more catch blocks. Multiple catch blocks allow us to handle each exception differently.

public class TryCatch {
    public static void main(String[] args) {
        int num = 0;
        try {
            num = 7 / 0;
        } catch (Exception e) {
            System.out.println(" Exception handled " + e.getMessage());
        }
        System.out.println(num);
    }
}
