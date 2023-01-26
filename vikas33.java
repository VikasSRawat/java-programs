import java.util.*;

public class vikas33 {
    static void print(LinkedList<Integer> l){
        for(int i=0;i<l.size();i++)
            System.out.print(l.get(i)+" ");
        System.out.println();
    }
    static void func(LinkedList<Integer> l){
        l.set(0,99);
        LinkedList<Integer> temp=new LinkedList<>(l);// This array list won't affect the real arraylist
        temp.set(1, 69);
    }
    static LinkedList<Integer> func2(){
        LinkedList<Integer> l2=new LinkedList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(69);
        return l2;
    }
    public static void main(String[] args) {
        LinkedList<Integer> al1 = new LinkedList<>();       
        LinkedList<Integer> al2 = new LinkedList<>();       
        al2.add(34);
        al2.add(24);
        al1.add(1);
        al1.add(2);
        al1.add(2);
        al1.add(2);
        al1.add(4);
        
        print(al1);
        
        // al1.addAll(al2);// appends at the ending of the list
        al1.addAll(al2);// Starts appending the elements of the al2 from index 2

        print(al1);

        System.out.println(al1.contains(34));// Returns true if the element is present inside the array list

        func(al1); // Will be passed by reference

        // al1.remove(al1.indexOf(24)); //Removing all the elements which gets the 1st index of 24
        LinkedList<Integer> l1=new LinkedList<>();
        l1.add(2);
        
        al1.removeAll(l1);// Removes all 2 from al1
        print(al1);

        print(al2);

        al2=func2();

        print(al2);
        
        al2.addLast(169);// This method exists in linkedlist but not in Arraylist

        print(al2);

        ArrayList <Integer> al3= new ArrayList<>();
        al3.add(11);
        al3.add(22);
        al3.add(33);

        LinkedList <Integer> ll=new LinkedList<>(al3);
        print(ll);
        
        System.out.println(al3);
    }
}
// Almost all the methods are same as Arraylist
// Works on the concept on Doubly Linked List data structure