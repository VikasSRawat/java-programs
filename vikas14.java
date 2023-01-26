// package sample;
//This will store this program inside the package 'sample'
//format of creating packages
//javac -d . filename.java
//javac -d stores tha programs into packages and . just puts the packages where the java programs are locted

//javac -d abc filename.java
//This will store the package 'sample' inside abc folder which is inside the folder where these java programs are stored
// package sample.sub;//This is also the same thing as abc i.e., it will create the a sub package inside sample package

//javac -d . *.java will store every open program in their specified package
//* is like all

package greet;
public class vikas14 {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}
