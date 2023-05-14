// The finally block always executes whether an exception occurs or not. For a try cath block there can be a single finally block.
public class TryCatchFinally {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        try{
            System.out.println(arr[3]);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Exception handled "+e.getMessage());
        }
        finally{
            System.out.println("This is Finally block");
        }
    }
}
