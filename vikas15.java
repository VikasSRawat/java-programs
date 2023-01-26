import greet.vikas14;//importing packages
import sub.makingpackage;//importing makingpackage 
public class vikas15{
    public static void main(String[] args) {
        vikas14 obj=new vikas14();
        makingpackage newobj=new makingpackage();//making object of the imported class in the package
        newobj.greet();
        newobj.game();

        //Still working on interfaces in packages
        //can we make an interface inside a package which already has a public class and implement that interface in the class to where it is being imported
    }
}
