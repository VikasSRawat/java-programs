import java.util.*;

public class vikas32 {
    static void print(ArrayList<Integer> l){
        for(int i=0;i<l.size();i++)
            System.out.print(l.get(i)+" ");
        System.out.println();
    }
    static void func(ArrayList<Integer> l){
        l.set(0,99);
        ArrayList<Integer> temp=new ArrayList<>(l);// This array list won't affect the real arraylist
        temp.set(1, 69);
    }
    static ArrayList<Integer> func2(){
        ArrayList<Integer> l2=new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(69);
        return l2;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();       
        ArrayList<Integer> al2 = new ArrayList<>(2);       
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
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(2);
        al1.removeAll(l1);// Removes all 2 from al1
        print(al1);

        print(al2);

        al2=func2();

        System.out.println(al2);
        print(al2);
        
        ArrayList<ArrayList<Integer>> l2=new ArrayList<ArrayList<Integer>>();// Making 2-D Arraylist

    }
}
// Works on the basis of Dynamic Array
