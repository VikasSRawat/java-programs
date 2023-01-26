import java.util.InputMismatchException;
import java.util.Scanner;

public class vikas29 {
    public static void main(String[] args) {
        boolean flag=true;
        Scanner sc=new Scanner(System.in);

        int [] marks= new int[4];
        marks[0]=34;
        marks[1]=11;
        marks[2]=-1;
        marks[3]=69;
        int ind;
        while(flag){
            System.out.println("Enter index value");
            ind=sc.nextInt();
            try{
                System.out.println("Level 1 try block");
                try{
                    System.out.println("Level 2 try block");
                    System.out.println(marks[ind]);
                    flag=false;
                }
                catch(ArrayIndexOutOfBoundsException E){
                    System.out.println("Level 2 catch block");
                    System.out.println("Array out of bound exception "+ E);
                }
            }
            catch(Exception e){
                System.out.println("Level 1 catch block");
                System.out.println("Exception "+e);
            }
        }
        System.out.println("Program end");
    }
}
