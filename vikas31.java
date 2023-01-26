public class vikas31 {
    public static int func(){
        try{
            int a=50;
            int b=0;
            int c=a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{// Will get executed no matter what
            System.out.println("This is the end of function and this finally block will execute even if exception is thrown");
        }
        return -1;
    }
    public static void main(String[] args) {
        // First example
        System.out.println(func());   

        // Second example
        int a=5,b=5;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println("Divide by zero exception ");
                break;
            }
            finally{
                System.out.println("I am finally block , I am inveitable for b = "+b);
            }
            b--;
        }
    }
}

// Finally block is used to execute instructions which are neccessary to be executed i.e., even if an exception occurs it 
// Will still execute the finally block

// It is used to execute instructions containing system resources , close a connection or close a file,etc.