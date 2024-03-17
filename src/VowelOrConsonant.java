//Programme to find entered alphabet is vowel or consonant

import java.util.Scanner; // import from JAVA

public class VowelOrConsonant // class name
{
    public static void main(String[] args) // main method
    {
        Scanner scanner = new Scanner(System.in); //object scanner class

        System.out.println("Entre the single character from alphabet");
        char z = scanner.next().charAt(0); //input from user and stored in char variable

        if ((z == 'a') || (z == 'A') ||
                (z == 'e') || (z == 'E') ||
                (z == 'i') || (z == 'I') ||
                (z == 'o') || (z == 'O') ||
                (z == 'u') || (z == 'U')) //condition check with if else
        {
            System.out.println("The Input letter is Vowel");
        }else {
            System.out.println("The Input letter is Consonant");
              }
    }
}
