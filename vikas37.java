import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class vikas37 {
    public static void main(String[] args) {
        File myfile=new File("vikas.txt");
        // try{
        //     myfile.createNewFile();// If a file already exist then nothing happens
        // } 
        // catch(IOException e){
        //     System.out.println("Unable to create a new file");
        //     e.printStackTrace();
        // }

        // For writing into a file
        // try{
        //     FileWriter fwr=new FileWriter("vikas.txt");
        //     fwr.write("I am adding this string to the file");// This will overwrite the file
        //     fwr.close();
        // }
        // catch(IOException e){
        //     System.out.println("not able to write into that file");
        //     e.printStackTrace();
        // }

        // For reading from a file
        // try{
        //     Scanner sc=new Scanner(myfile);
        //     while(sc.hasNext())
        //         System.out.println(sc.nextLine());
        // }
        // catch(Exception e){
        //     e.printStackTrace();
        // }

        // For deleting a file
        if(myfile.delete())
            System.out.println("I have deleted that file");
        else
            System.out.println("Some problem occured while deleting that file");
    }
}
