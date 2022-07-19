// Printing numbers in Decresing Order

// public class RecursionIntro {
// public static void recursion(int n) {
// if (n == 0) {
// return;
// }
// System.out.println(n);
// recursion(n - 1);
// }

// public static void main(String[] args) {
// recursion(10);
// }
// }

// Printing numbers from 1 to n

public class RecursionIntro {
    public static void recursion(int n) {
        if (n > 50) {
            return;
        }
        System.out.println(n);
        recursion(n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
        recursion(n);

    }
}
