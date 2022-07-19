
public class PrintArrayElements {

    public static void print(int[] arr, int Sindex, int len) {
        if (len == 0) {
            return;
        }
        System.out.println(arr[Sindex]);
        print(arr, Sindex + 1, len - 1);
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        print(arr, 3, 4);

    }
}
