import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_ {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        Scanner sc = new Scanner(System.in);

        // add method to add an elemnt to the arraylist
        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            list.add(a);
        }

        // set method to change an element from a given index
        list.set(3, 5);

        // remove method to delete an element at given index
        list.remove(3);

        // get method to print the arraylist
        System.out.println("The arraylist :");
        for (int i = 0; i < 4; i++) {
            System.out.println(list.get(i));
        }

        // size method returns the size of the arraylist and the indexOf method returns the index of the value in the parameter
    }
}
