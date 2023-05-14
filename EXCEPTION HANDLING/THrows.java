// If a method is generating an exception and i.e. not handled inside that method then the method should throws those exceptions and should be handled while calling them

public class THrows {
    public static int div() throws ArithmeticException {
        return 1 / 0;
    }

    public static void main(String[] args) {
        try {
            THrows.div();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Program Executed");
    }
}
