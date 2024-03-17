//The programme is to find average of 5 numbers given by User

import java.util.Scanner; // import from JAVA

public class AverageOf5Numbers // class name
{
    public static void main(String[] args) // main method of the class
    {
        Scanner scanner = new Scanner(System.in); // scanner class object to accept user value

        System.out.println("Entre the 1st number");
        double num1 = scanner.nextInt(); //Soring 1st value which user has entered

        System.out.println("Entre the 2nd number");
        double num2 = scanner.nextInt(); // Soring 2nd value which user has entered

        System.out.println("Entre the 3rd number");
        double num3 = scanner.nextInt(); // Soring 3rd value which user has entered

        System.out.println("Entre the 4th number");
        double num4 = scanner.nextInt(); // Soring 4th value which user has entered

        System.out.println("Entre the 5th number");
        double num5 = scanner.nextInt(); // Soring 5th value which user has entered

        double average = ((num1+num2+num3+num4+num5)/5); //Logic to find average of 5 values
        System.out.println("The average of 5 numbers is : "+average); // Printing out average value of console window

    }
}
