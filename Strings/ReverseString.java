public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("monsoon");
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < sb.length(); i++) {
            str.insert(i, sb.charAt((sb.length() - 1) - i));
        }
        System.out.println(str);
    }
}
