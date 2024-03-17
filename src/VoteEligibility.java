//Programme to find vote eligibility by age

import java.util.Scanner; // import from JAVA

public class VoteEligibility // class name
{
    public static void main(String[] args) // main method
    {
        Scanner scanner = new Scanner(System.in); // object of scanner class

        System.out.println("Entre your age");
        int age = scanner.nextInt(); //input from user and stored in int variable

        if(age >= 18) //condition checking with if else
        {
            System.out.println("You are Eligible for the vote");
        }else {
            System.out.println("You are not Eligible for the vote");
        }
    }
}
