
public class _StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Boss");
        System.out.println(sb);

        // setCharAt Function
        sb.setCharAt(0, 'l');
        System.out.println(sb);

        // insert Function
        sb.insert(0, 'A');
        System.out.println(sb);

        // delete Function
        sb.delete(0, 1);
        System.out.println(sb);

        // append Function
        sb.append(" is too sad");
        System.out.println(sb);
    }
}
