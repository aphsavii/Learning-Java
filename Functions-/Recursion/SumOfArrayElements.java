
public class SumOfArrayElements {

    public static int sum(int[] arr, int Sindex, int len) {
        if (len == 0) {
            return 0;
        } else {
            return arr[Sindex] + sum(arr, Sindex + 1, len - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        System.out.println(sum(arr, 2, 4));
    }
}
