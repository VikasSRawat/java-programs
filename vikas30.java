import java.util.Scanner;

import javax.xml.catalog.Catalog;

class Myexception extends Exception{ // Making custom exceptions in java using Exception class
    // We can override the toString(),getMessage() and printStackTrace() methods in java
    @Override
    public String toString(){
        return "Age should not be greater than 69";
    }
    @Override
    public String getMessage(){
        return "Please enter the correct age";
    }
}
public class vikas30 {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a>69){
            try{
                throw new Myexception(); // Making a new object of that exception class and throwing it
            }
            catch(Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e);// By default it will print e.toString
            }
        }
        System.out.println("done");
    }
}
// Throw keyword is used to throw programmer explicit exceptions