//Programme to find value of key entered by User

import java.util.Scanner; // import from JAVA

public class ValueOfEntreKey //class name
{
    public static void main(String[] args) // main method
    {
        Scanner scanner = new Scanner(System.in); //object of scanner class

        System.out.println("Entre any value from the keyboard");
        char val = scanner.next().charAt(0); //input from username & stored in char

        if((val >= 'a' && val >= 'z' ) || (val >= 'A' && val >= 'Z' )) //condition check with nested if else
        {
            System.out.println("Entered value is Alphabet");
        }else if(val >= '0' && val <= '9')
        {
            System.out.println("Entered value is Number");
        }else
        {
            System.out.println("Entered value is Symbol");
        }
    }

}
