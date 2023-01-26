interface GPS {
    void locate();
    default void sendlocation(){
        System.out.println("Sending your current location");
    }
}
interface camera{
    void photos();
}

class c1{
    void name(){
        System.out.println("This is name of c1");
    }
    void greet(){
        System.out.println("Good Morning");
    }
    void overload(int num){
        System.out.println("This is overload with arguement "+num);
    }
}

//We can also extend and implement all at the same time
class smartphone extends c1 implements GPS,camera {
    public void locate(){
        System.out.println("Locating your location");
    }
    public void photos(){
        System.out.println("Clicking your photos");
    }
    void name(){
        System.out.println("This is name of smartphone");
    }
    void overload(){
        System.out.println("This is overload without any arguement");
    }
    void myfunc(){
        System.out.println("This is smarthphone's own function");
    }
}


public class vikas11 {
    public static void main(String[] args) {
        GPS obj=new smartphone();
        //We are making a smartphone object but with reference to GPS interface 
        //Hence obj can only use GPS methods and not camera
        obj.locate();
        // obj.photos(); //This is not allowed as it is a method of camera hences gives error
        // obj.myfunc();// This is also not allowed as it is not defined in GPS
        
        //similarly we can do polymorphism with classes
        c1 newobj=new smartphone();
        newobj.name();//will get smartphone name and not c1 as it is being overridden in smartphone
        // newobj.locate();//But cannont access methods which are not part of c1
        newobj.greet();
        // newobj.overload();//This will not run even though it has the same name but the arguement lists are still different in c1 as compared to smartphone
        newobj.overload(34);
        // newobj.myfunc();//This is not allowed as class c1 does not contain myfunc method

        //Gives error as smartphone is not being inherited by c1
        // smartphone newobj2=new c1();
        // newobj2.name();
    }
}


