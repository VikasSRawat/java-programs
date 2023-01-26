import java.util.Scanner;

public class vikas28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[4];
        marks[0] = 34;
        marks[1] = 11;
        marks[2] = -1;
        marks[3] = 69;

        System.out.println("Enter the index of the array which you want to divide");
        int ind = sc.nextInt();

        System.out.println("Enter the number which you want to divide it with");

        try {
            int num = sc.nextInt();
            System.out.println("The value at index " + num + " is " + marks[ind]);
            System.out.println("The qoutient is " + marks[ind] / num);
        }
        // These are specific exceptions in jave where a catch block will only catch
        // specific exceptions
        catch (ArrayIndexOutOfBoundsException e) {// out of bound exception for index
            System.out.println("Accessing an out of bound index " + e);
        } catch (ArithmeticException e) {// Divide by zero exception
            System.out.println("Divide by 0 excetion " + e);
        } catch (Exception e) {// Other exceptions like entering a character instead of an integer for num
            System.out.println("Other excetpion" + e);
        }
        System.out.println("Program end");
    }
}
