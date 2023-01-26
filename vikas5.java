import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;

//Methods are like functions
//They are functions which are written inside a class
//We use methods when they are written inside a class but we use functions without any class(ex in C++)
class test{
    static void greet(){
        System.out.println("Hello this is a greeting from the gods");
    }
    public void show(){
        System.out.println("This is public show method of test class");
        System.out.println("Calling greet from show method itself in test class");
        test.greet();
    }
}

public class vikas5 {

    //When we use static it means that only one time the memory allocated to this method
    //i.e., every object will be accessing the same function inside of this class
    //But when we remove static we need to create an object to access the functions
    static int logic(int x,int y)
    {
        if(x>y)
            return x+y;
        else
            return (x+y)*5;
    }
    static void show(){
        System.out.println("Hey this is show method()");
    }

    // Overloading area method
    // We can overload a method by changing the parameters
    // They cannot be performed by changing the return type
    static void area(int x){
        System.out.println("The area of the square is "+x*x);
    }
    static void area(float x){
        System.out.println("The area of the circle is "+3.14*x*x);
    }
    static void area(int x,int y){
        System.out.println("The are of the rectangle is "+x*y);
    }


    // This is known as varargs where the arguements passed are being stored inside an array
    static int sum(int ...arr){
        int result=0;
        for(int a:arr)
            result+=a;
        return result;
    }
    static int func(int x,int ...a){
        int sum=x;
        for(int i:a)
            sum+=i;
        return sum;
    }
    void display(){
        System.out.println("This is a display function");
    }

    //Now for recursion
    static int fact(int x){
        if(x==0||x==1)
            return 1;
        return x*fact(x-1);
    }
    public static void main(String[] args) {
        // When we put static inside the function declaration then we can call this method without any object
         System.out.println(logic(23, 111));
         System.out.println(logic(11, 21));

        // When we don't add static to the function we will have to create a class object in which the method is defined in
        // vikas5 obj=new vikas5();
        // System.out.println(obj.logic(11, 12));

        // vikas5 obj1=new vikas5();
        // System.out.println(obj1.logic(11, 11));
        // We can also access static methods with a class but java will show a warning

        test objTest=new test();
        objTest.show();

        show();
        area(11);
        area(12.4f);
        area(33,11);

        // Passing multiple args which are stored inside an array
        System.out.println("The sum of 1,2,3 is "+sum(1,2,3));
        System.out.println("The sum of 1,2,3,4,5,6,7,8,9 is "+sum(1,2,3,4,5,6,7,8,9));
        System.out.println("Without passing any arguements "+sum());

        System.out.println("Calling a function in which at least one arguement has to be called "+func(11,1,2,3,4,5,6));

        // System.out.println(func());
        // When calling func without any arguements (which is supposed to accept atleast one arguement ) will throw an error
        

        System.out.println("The factorial of 5 using recursion is "+fact(5));

        // greet();//Gives error
        test.greet();//can access another class static functions without an object but with a class
        // test.show();//Gives error

        // vikas5 o=new vikas5();
        // o.display();//non-static methods being called from another method in the same class it is defined in has to be called using an object
    }
}
