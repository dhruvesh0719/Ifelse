//Programme to find Positive, Negative or Zero number

import java.util.Scanner; // import from JAVA

public class PositiveNegativeNum //class name
{
    public static void main(String[] args) // main method
    {
        Scanner scanner = new Scanner(System.in); //scanner object

        System.out.println("Entre the the number"); //input from user and stored in double variable
        double num = scanner.nextInt();

        if(num == 0) //condition statement with if else
        {
            System.out.println("The number is Zero");
        }else if(num > 0)
                {
                    System.out.println("The number is Positive");
                }else{
                        System.out.println("The number is Negative");
                     }
    }
}
