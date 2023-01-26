import java.util.*;
public class vikas4 {
    public static void main(String[] args) {
        //if-else , switch-case, for-loops,while-loops,do-while loops same as in c/c++
        int array[]={1,2,3,4,5};
        System.out.println(array[0]);
        //we can also declare arrays like int []marks
        
        int marks[]=new int[3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
            marks[i]=sc.nextInt();
        for(int i=0;i<3;i++)
            System.out.println(marks[i]);

        System.out.println("Printing the length of the array using length method "+marks.length);
        sc.close();

        //for each will print till the length allocated to it
        for(int i: marks){
            System.out.println(i);
        }
    }
}
