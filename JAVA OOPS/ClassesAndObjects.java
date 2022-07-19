class Student {
    String name;
    int reg_no;

    public void concatinate(String A, String B) {
        String C = A + B;
        System.out.println(C);
    }
}

public class ClassesAndObjects {

    public static void main(String[] args) {

        Student A = new Student();
        Student B = new Student();
        A.name = "Avinash";
        B.name = " Kumar";
        System.out.print(A.name);
        System.out.print(B.name);
        A.concatinate(A.name, B.name);
    }
}
