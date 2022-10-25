import java.net.http.HttpResponse.PushPromiseHandler;
import java.util.*;

// The Java collections framework has a class named Stack that provides the functionality of the stack data structure.

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        // push() method to insert element in the stack
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

        for (Integer integer : st) {
            System.out.println(integer);
        }
        System.out.println();
        // pop() method to delete the topmost element of the stack
        st.pop();
        for (Integer integer : st) {
            System.out.println(integer);
        }
        System.out.println();

        // peek() method returns the topmost element of the stack
        System.out.println(st.peek());
        System.out.println();

        // search() method is used to search for a specific element in the stack and
        // returns the positionn of the element from the top of the stack
        int pos = st.search(4);
        System.out.println(pos);
        System.out.println();
        // empty() method checks wheather the stack is empty or not and returns bool
        System.out.println(st.empty());
    }
}
