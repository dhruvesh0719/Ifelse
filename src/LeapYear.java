
// This programme is finding a given year leap year or not


import java.util.Scanner; // import from JAVA

public class LeapYear // class name
{
    public static void main(String[] args) //main method
    {
        Scanner scanner = new Scanner(System.in); //Scanner class to get user input

        System.out.println("Entre a YEAR of your choice");
        int year = scanner.nextInt(); //User input stored in int variable name year

        if (year % 4 == 0 && year % 100 != 0) //Boolean condition to check leap year
        {
            System.out.println(+year + " is a LEAP YEAR");
        } else {
            System.out.println(+year + " is not LEAP YEAR");

               }
    }

}