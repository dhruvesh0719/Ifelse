//Programme to display week day name depend on user input

import java.util.Scanner; // import from JAVA

public class DayName // class name
{
    public static void main(String[] args) // main method of class
    {
        Scanner scanner = new Scanner(System.in); //scanner class object

        System.out.println("Entre the any Number");
        int a = scanner.nextInt(); // input from user and stored in int variable

        if (a == 1) //checking condition by if else ladder
        {
            System.out.println("The day is : Monday");
        } else if (a == 2) {
            System.out.println("The day is : Tuesday");
        } else if (a == 3) {
            System.out.println("The day is : Wednesday");
        } else if (a == 4) {
            System.out.println("The day is : Thursday");
        } else if (a == 5) {
            System.out.println("The day is : Friday");
        } else if (a == 6) {
            System.out.println("The day is : Saturday");
        } else if (a == 7) {
            System.out.println("The day is : Sunday");
        } else {
            System.out.println("Entre a number between 1 to 7");
        }
    }
}