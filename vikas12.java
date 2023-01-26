abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainpen extends pen{
    public void write(){
        System.out.println("Writing with pen");
    }
    public void refill(){
        System.out.println("Refilling the pen");
    }
    public void changenib(){
        System.out.println("Changing the nib of the fountain per");
    }
}



class monkey{
    public void jump(){
        System.out.println("Jumping");
    }
    public void bite(){
        System.out.println("Taking out a bite");
    }
}
interface basicanimal{
    void eat();
    void step();
}
class human extends monkey implements basicanimal{
    public void eat(){
        System.out.println("Eating");
    }
    public void step(){
        System.out.println("stepping");
    }
}

interface remote{
    void switchon();
}
interface smartremote extends remote{
    void googleassisstant();
}

abstract class telephone{
    abstract void ring();
    abstract void lift();
}

public class vikas12 extends telephone implements smartremote{
    public void ring(){
        System.out.println("This is ringing");
    }
    public void lift(){
        System.out.println("This is lifting");
    }
    public void switchon(){
        System.out.println("Switching on");
    }
    public void googleassisstant(){
        System.out.println("Using google assisstant");
    }
    // We can make objects of the public class and it can also be extended with other classes
    public static void main(String[] args) {
        fountainpen obj=new fountainpen();
        obj.write();
        human person=new human();
        person.jump();
        person.eat();
        telephone phone=new vikas12();
        phone.ring();


        monkey animal=new human();
        animal.bite();
        // animal.eat();

        
        vikas12 s=new vikas12();
        s.switchon();
    }   
}
//we can also extend vikas12 to tv
class tv extends vikas12{
    void func(){

    }
}