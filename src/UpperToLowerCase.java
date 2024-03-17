//Programme to convert Uppercase to Lowercase

import java.util.Scanner; // import from JAVA

public class UpperToLowerCase // class name
{
    public static void main(String[] args) // main method
    {
        Scanner scanner = new Scanner(System.in); //object of scanner class

        System.out.println("Entre the word");
        String word = scanner.next(); //input from user and stored as String variable

        System.out.println("The lower case of entered word is : " +word.toLowerCase());
    }
}
