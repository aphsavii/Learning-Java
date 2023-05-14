// User defined exceptions can be thrown using the throw keyword
class AgeException extends Exception {
    public void print() {
        System.out.println("User Defined exception : Incorrect Age");
    }
}

public class UserDefinedException {
    int age;

    public UserDefinedException(int age) {
        this.age = age;
    }

    public void check(){
        try{
            if(age<18||age>60){
                throw new AgeException();
            }
            System.out.println("Correct Age");
        }
        catch(AgeException e){
            e.print();
        }
    }

    public static void main(String[] args) {
        int age=20;
        UserDefinedException use=new UserDefinedException(age);
        use.check();
    }
}
