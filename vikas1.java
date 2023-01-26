import java.util.Scanner;
public class vikas1{
    //static makes it possible to run the class without creating any objects
    public static void main(String args[]){
        System.out.println("Hello world");
        //println adds a new line after printing its contents inside 
        //print does not add any new line
//AddTwoNumber -->Pascal naming convention used for classes
//addTwoNumber--> camelCase naming convention used for functions
        // double age=34.5;
        // long age=340000000000l;//adding a l or L signifies that the varible is of type long
        // float age=23.5F;//Similarly for float it will give type conversion error hence f or F is required
        // byte age=22;//Byte is stroing data from a range of -128 to 127 . This is particularly useful for saving data
        Scanner sc=new Scanner(System.in);
        // System.out.println(age);
        // System.out.print("Enter a number : ");
        // int a=sc.nextInt();
        // System.out.print("Enter a number : ");
        // int b=sc.nextInt();
        // System.out.println("sum of the numbers are : "+(a+b));
        //.nextInt() used for taking integer inputs from the user
        //.nextLine() used for taking string inputs from the user
        //.nextFloat() for double
        // double d=sc.nextDouble();//for double 
        // byte bt=sc.nextByte();//for byte but will give error if numnber is not in range from -128 to 127
        // boolean b1=sc.hasNextInt();//returns true if the user has entered int else will return false
        //similarly hasnextFloat will check for float numbers
        //similarly hasnext exists for other data types
        // System.out.println(b1);
        System.out.println(56<4);//returnns true or false when performing comparison operators or logical operators
        int n1=3;
        // float f1=n1+4.4; will give error as 4.4 is a double hence for converting it into float we should specify a f at the end of the expression
       // float f1=n1;//won't give error for direct conversion form int to float
        double d1=n1;//similarly for double
        System.out.println(d1);
        //we cannot convert incompatible datatypes in java such as character and num;
        // char ch='a';
        // int num=3;
        // ch=num; This will give a mismatch error
        /*
            Arithematic operation and their resultant datatype

            b-byte
            f-float
            s-short
            c-character
            i-integer
            l-long
            d-double

            b+s ->int
            i+s ->int
            l+f->float
            i+f->float
            c+i->int
            c+s->int
            l+d->double
            f+d->double
        */ 

        char ch='A';
        ch++;
        System.out.println(ch);
        // character also gets incremented
        //ARITHEMATIC OPERATIONS CAN BE PERFORMED ON CHARACTERS
        System.out.println((char)'A'+'B'); 
        //The result will be in int although

        
        sc.close();
        
    }
}