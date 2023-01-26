
class library {
    // library(){
        String []books = new String[100];
        int i = 0;
    // }

    public void addbooks(String newbook) {
        this.books[i] = newbook;
        i++;
        System.out.println("The book has been added");
    }

    public void displaybooks() {
        for (String str : this.books) {
            if (str == null)
                continue;
            else
                System.out.println("* " + str);
        }
    }
    public void issuebooks(String str){
        for(int i=0;i<this.books.length;i++)
        {
            if(this.books[i]==str)
            {
                System.out.println("The book has been issued");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("The book which you have asked for has either been issued or not there");
    }
}

public class vikas13 {
    public static void main(String[] args) {
        library obj = new library();
        obj.addbooks("c++");
        obj.addbooks("python");
        obj.addbooks("java");
        obj.displaybooks();
        obj.issuebooks("java");
        obj.issuebooks("java");
        obj.addbooks("java");
        int a;
        java.util.Scanner sc=new java.util.Scanner(System.in);
        // Scanner sc=new java.util.Scanner(System.in);//   Not allowed
        a=sc.nextInt();
        System.out.println("Using java scanner without importing the library directly "+a);
    }
}
