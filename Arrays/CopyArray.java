// import java.util.Scanner;

// public class CopyArray {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int[] arr = new int[5];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = input.nextInt();
//         }
//         int[] arr2 = arr;

//         for (int data : arr2) {
//             System.out.println(data);
//         }
//         input.close();
//     }
// }

//  Copying array using pre-defined Functions :

import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int[] arr2 = new int[5];
        System.arraycopy(arr, 0, arr2, 0, 3);
        for (int data : arr2) {
            System.out.println(data);
        }
        input.close();
    }

}
