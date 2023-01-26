class bookseats{
    int total_bookseats=10;
    synchronized void book(int seat){
        if(total_bookseats>=seat){
            total_bookseats-=seat;
            System.out.println("Seats booked \n Remaining seats = "+total_bookseats);
        }
        else{
            System.out.println("Insuffiecient seats \n Remaining seats = "+total_bookseats);
        }
    }
}

public class vikas25 extends Thread{
    static bookseats b;
    int seats;
    public void run(){
        b.book(seats);
    }
    public static void main(String[] args) {
        b=new bookseats();
        vikas25 vikas=new vikas25();
        vikas25 sakiv=new vikas25();

        vikas.seats=7;
        sakiv.seats=5;

        vikas.start();
        sakiv.start();
    }   
}

// The above code might give an incorrect output as it will give a wrong output(i.e., no of seats available <0) 
// this is due to the fact that both threads vikas and sakiv are accessing book method at the same time which is static hence
// both the threads are accessing the same memory location hence changes made to one might give changes to other 

// They both can satisfy the condition of total_bookseats>=seat as vikas will enter that condition and then the thread scheduler 
// will schedule sakiv to run and it also will satisfy the condition as vikas did not change the total_bookseats causing it to give negative answers


// Synchronization will solve this problem
// By adding the word synchronize to the declaration of any method, we are able to make it so that only one thread 
// is able to access that method and no other string will be access it 
// By doing this , it will always give the correct ouptut


// Synchronization in Java is the capability to control the access of multiple threads to any shared resource.
// Java Synchronization is better option where we want to allow only one thread to access the shared resource.

// The synchronization is mainly used to

// To prevent thread interference.
// To prevent consistency problem.