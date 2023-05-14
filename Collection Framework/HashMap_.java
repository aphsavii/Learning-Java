import java.util.*;

public class HashMap_ {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> hmp = new HashMap<>();

        // /Putting key value pairs
        hmp.put(8, "Rahul Singh");
        hmp.put(11, "Nishanta");
        hmp.put(14, "Rajnish Raj");
        hmp.put(15, "Avinash kumar");

        // printing HashMap
        System.out.println(hmp);
        System.out.println();

        // put() method is used to add elements to a hashmap
        hmp.put(29, "Siddhant");
        hmp.put(16, "Shubhagya");
        System.out.println(hmp);
        System.err.println();

        // get() method is used to access the hashmap elements | It taKes key as
        // parameter
        System.out.println(hmp.get(14));
        System.out.println();

        // keyset(), values(), entryset() can be used to access set views of keys,
        // values and key/value pairs respectively
        System.out.println(hmp.keySet());
        System.out.println(hmp.values());
        System.out.println(hmp.entrySet());
        System.out.println();

        // replace() method can be used to replace a vlaue of a specifeid key given as
        // argument
        hmp.replace(15, "Anonymous");
        System.err.println(hmp);

        // remove() method can be used to remove an element from the hashmap
        hmp.remove(16);
        System.out.println(hmp.entrySet());
    }
}
