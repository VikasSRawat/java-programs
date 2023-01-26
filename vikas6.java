// Note there can only be a single public class in a single java file as the public class name should be same as the filename
class employee{
    public int id,sal;
    public void disp(){
        System.out.println("My id is "+this.id);
        System.out.println("My salary is "+this.sal);
    }
    private int age;
    public void setage(int a){
        age=a;
    }
    public int getage(){
        return age;
    }   
}

class democonstructor{
    int id;
    String name;
    float sal=0;
    democonstructor(){
        System.out.println("Ayo this is a default constructor");
    }
    democonstructor(int x, String name){
        System.out.println("Ayo this is a parameterized constructor");
        this.id=x;
        this.name=name;
    }
    democonstructor(int x, String name,float z){
        System.out.println("Ayo this is an overloaded parameterized constructor");
        this.id=x;
        this.name=name;
        this.sal=z;
    }
     void disp(){
        System.out.println("The name , id and salary of this object is "+name+" , "+id+" "+sal);
    }
}
 //In java we cannot define a method outside the class
public class vikas6 {
    public static void main(String[] args) {
        employee emp=new employee();//Creating a new object of employee class
        emp.id=69;
        emp.sal=10000;
        // System.out.println(emp.id);
        // System.out.println(emp.sal);
        emp.disp();

        employee emp1=new employee();
        emp1.id=70;
        emp1.sal=11000;
        emp1.disp();

        // emp.age=0; We cannot access private attributes outside the class

        emp.setage(20);
        System.out.println("The age of employee is "+emp.getage());

        democonstructor obj2=new democonstructor(23,"Vikas");
        obj2.disp();
        democonstructor obj3=new democonstructor(123,"John",12500f);
        obj3.disp();
    }
}
