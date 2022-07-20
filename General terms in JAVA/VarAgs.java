// VarAgs means we can send multiple parameters in a method and it will trun into an array of the specified Data type 

class VariableArgumentsTest {
    public void sum(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("THe sum is : " + sum);
    }
}

public class VarAgs {
    public static void main(String[] args) {
        VariableArgumentsTest obj = new VariableArgumentsTest();
        obj.sum(1, 2, 3, 4, 5);
    }
}
