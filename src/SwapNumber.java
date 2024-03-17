// Programme to swap numbers

import java.util.Scanner; // import from JAVA

public class SwapNumber // class name
{
    public static void main(String[] args) // main method
    {
        Scanner scanner = new Scanner(System.in); // scanner object

        System.out.println("Entre the 1st number A");
        int a = scanner.nextInt(); //input from user and stored as int variable

        System.out.println("Entre the 2nd number B");
        int b = scanner.nextInt(); //input from user and stored as int variable

        int c = a; //logic to swap
        a = b;
        b = c;

        System.out.println("The value of the A is :" + a);
        System.out.println("The value of the B is :" + b);
    }
}
