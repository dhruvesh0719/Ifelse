//Programme to perform mathematical action depend on user input of + or - or / or *

import java.util.Scanner; // import from JAVA

public class Calculator // class name
{
    public static void main(String[] args) // main method
    {
        Scanner scanner = new Scanner(System.in); //object of scanner class

        System.out.println("Entre the 1st Number"); // accepting value from user
        int a = scanner.nextInt(); // storing value in a

        System.out.println("Entre the 2nd Number"); // accepting another value from user
        int b = scanner.nextInt(); // storing value in b

        System.out.println("Entre the any Symbol from (+ , - , / , * )"); // accepting symbol from user
        char z = scanner.next().charAt(0); //storing value in z

        if (Character.toUpperCase(z) == '+') //comparing entered value with one of requirement
        {
            System.out.println("The Addition of two numbers you entered is :" + (a + b)); // if condition satisfy then print this
        } else if (Character.toUpperCase(z) == '-') //comparing entered value with one of requirement
        {
            System.out.println("The Subtraction of two numbers you entered is :" + (a - b)); // if condition satisfy then print this
        } else if (Character.toUpperCase(z) == '/') //comparing entered value with one of requirement
        {
            System.out.println("The Division of two numbers you entered is :" + (a / b)); // if condition satisfy then print this
        } else if (Character.toUpperCase(z) == '*') //comparing entered value with one of requirement
        {
            System.out.println("The Multiplication of two numbers you entered is :" + (a * b)); // if condition satisfy then print this
        } else {
            System.out.println("Entre the any Symbol from (+ , - , / , * )"); //if any of condition do not satisfy then print this
        }
    }
}
