import java.lang.Exception;
public class vikas27 {
    public static void main(String[] args) {
        int a=20;
        int b=0;

        // System.out.println(a/b);
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("Error \nWe failed to divide due to the reason : "+e);
        }

        System.out.println("End of program ");// Without try catch block this line won't execute die to Exception in main thread
    }
}
// This Exception is a type of checked exception