// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

package patterns.NonStarPatterns;

public class pattern4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
