//Programme to find odd or even number

import java.util.Scanner; // import from JAVA

public class OddEvenNumber // class name
{
    public static void main(String[] args) // main method
    {
        Scanner scanner = new Scanner(System.in); // scanner object

        System.out.println("Entre the 1st Number");
        int a = scanner.nextInt(); // input from user and stored as int variable


        System.out.println("Entre the 2nd Number");
        int b = scanner.nextInt(); // input from user and stored as int variable

        String z = (a % 2 == 0) ? "The 1st number is Even number" : "The 1st number is Odd number";
        System.out.println(z); //turnery operator to check condition

        String y = (b % 2 == 0) ? "The 2nd number is Even number" : "The 2nd number is Odd number";
        System.out.println(y); //turnery operator to check condition
    }
}
