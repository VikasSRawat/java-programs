public class vikas3 {
    public static void main(String[] args) {
        String name="Vikas Singh Rawat";
        System.out.println(name);
        System.out.println(name.length());//returns the length of the string passed
        System.out.println(name.toLowerCase());//returns the lowercase of the string passed
        System.out.println(name.toUpperCase());//returns the uppercase of the string passed
        //Note : the original string does not change as strings are immutable But instead a new string is created and returned following the operation performed
        String str="     god is great     ";
        System.out.println(str.trim());// removes all whitespaces from the starting and ending of the string passed
        //ex : "      god is great       "    ---->         "god is great"
        System.out.println(name.substring(4));//returns a substring from the 4th index till the end of the string (s Singh Rawat)
        System.out.println(name.substring(4,10));//returns a subtring from the 4th index till the 9th index(does not inlclude the 10th index) (s Sing)
        System.out.println(name.replace('a', 'p'));//returns a new string which replaces the character 'a' with character 'p'
        System.out.println(name.replace("as", "kljj"));//returns a new string which replaces the string mentioned with another mentioned string
        //Returns boolean true is string passed matches with the starting of the string passed or else false
        System.out.println(name.startsWith("Vi"));//true
        System.out.println(name.startsWith("raw"));//false
        //similarly like startswith it will return true if the string ends with mentioned string passed
        System.out.println(name.endsWith("at"));//true
        System.out.println(name.endsWith("aat"));//false

        //Note : both startwith and endswith only accepts strings

        System.out.println(name.charAt(10));//returns the character at the index passed
        // System.out.println(name.charAt(100))//If the indexed passed is out of range java will throw an exception and ends the program
        System.out.println(name.indexOf("gh "));//Returns the index of the starting substring which is first occuring substring of the string passed inside the function
        System.out.println(name.indexOf("xc"));//it will return -1 if the string passed is not a substring inside the string
        // String modifiedname
        name = "king of the kings in this kingdom";
        System.out.println(name.indexOf("kin",5));// It will start searching from the index 5 till the end of the string for the occurence of kin

        System.out.println("The last index of g is "+name.lastIndexOf('g'));
        int a=name.indexOf('g');
        System.out.println("The second index of g is "+name.indexOf('g', a+1));
        System.out.println(name.lastIndexOf("kin"));//;returns the last occuring of the substring kin 
        System.out.println(name.lastIndexOf("kin", 26));//it will  include the starting of the index as part of the last indexes we need to search i.e., it will go on searching the last index of the substring by counting the number of indexes it has travesed(length of the substring)
        name="Vikas";
        System.out.println(name.equals("Vikas"));
        System.out.println(name.equals("VikaS"));//returns false as every character should be same and also should be of the same case
        System.out.println(name.equalsIgnoreCase("ViKaS"));//returns true as it will ignore the case of the string and only will check the character

        String text="To remove spaces with underscore";
        System.out.println(text.replace(' ', '_'));
        text="to many     whitespaces";
        System.out.println(text.replace(' ', '_'));

        text="Dear <|name|>, thanks a lot";
        System.out.println(text.replace("<|name|>", name));

        text="This string is used to detect  double and   triple spaces";
        System.out.println(text.indexOf("  "));
        System.out.println(text.indexOf("   "));
        
        
    }
}
