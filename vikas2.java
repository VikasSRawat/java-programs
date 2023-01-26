import java.util.Scanner;

public class vikas2{
    public static void main(String[] args) {
    //Strings can be initialized directly using String datatype
    double da=Double.parseDouble(args[0]);
    System.out.println(da);
    Scanner sc=new Scanner(System.in);
    String name=new String("Vikas singh Rawat");
    name="God is an idiot";
    System.out.println(name);
    name=sc.nextLine();//can read input till newline i.e., till we press enter
    System.out.println("Using .nextLine() "+name);
    name=sc.next();// can read input till space or till we press enter
    System.out.println("Using .next() "+name);

    //But character arrays are different form Strings in java
    char[] chararray={'a','b','c'};
    for(char c:chararray)
        System.out.print(c);
    System.out.println("");
    //unlike strings character array are mutable
    chararray[0]='f';
    for(char c:chararray)
        System.out.print(c);
    System.out.println("");
    //we can also print the character using normal for loop and indexing in java.
    for(int i=0;i<3;i++)
        System.out.print(chararray[i]+" ");
    System.out.println("");
    //we can also take input from the user directly inside the character array without using any loop
    char[] arr=new char[5];
    arr=sc.next().toCharArray();
    System.out.println("Using sout to print the character arrays whose input was taken from the user");
    for(char c:arr)
        System.out.print(c);

    //we can also convert string to character arrays in java by 2 methods
    String str="Hello world";
    //1. simple copying
    System.out.println("\nCopying the content of string using normal loop copy");
    char array[]=new char[str.length()];
    for(int i=0;i<str.length();i++)
        array[i]=str.charAt(i);
    for(char ch:array)
        System.out.print(ch);
    
    
    //2. using toCharArray() method
    System.out.println("\nCopying content of 1 array to another using .toCharArray() method");
    char array2[]=new char[str.length()];
    array2=str.toCharArray();
    for(char ch:array2)
        System.out.print(ch);

    int a=6;
    float b=19.8f;
    //printf() is the same as in c programming in c as we mention the format specifier.
    System.out.printf("\na = %d\nb= %f",a,b);
    
    sc.close();
    }
}
