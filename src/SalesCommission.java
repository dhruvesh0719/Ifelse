// Programme to find Sales Commission

import java.util.Scanner; // import from JAVA

public class SalesCommission // class name
{
    public static void main(String[] args) //main method
    {
        Scanner scanner = new Scanner(System.in); // scanner class object

        System.out.println("Entre the Sale's ID"); //input from user and stored in int variable
        int Sale_ID = scanner.nextInt();

        System.out.println("Entre the Sale's name"); //input from user and stored in String variable
        String Sale_name = scanner.next();

        System.out.println("Entre the Sales amount"); //input from user and stored in double variable
        double Sale_amount = scanner.nextInt();

        System.out.println("Entre the Basic Salary"); //input from user and stored in double variable
        double Basic_salary = scanner.nextInt();

        if(Sale_amount >= 50000) //condition check with if else ladder
        {
            System.out.println(Sale_name.concat("'s Sales Commission is "+(Sale_amount*0.35)));
        } else if (Sale_amount >= 30000)
            {
                System.out.println(Sale_name.concat("'s Sales Commission is "+(Sale_amount*0.20)));
            } else if (Sale_amount >= 20000)
            {
                System.out.println(Sale_name.concat("'s Sales Commission is "+(Sale_amount*0.10)));
            } else if (Sale_amount >= 10000)
            {
                System.out.println(Sale_name.concat("'s Sales Commission is "+(Sale_amount*0.05)));

            }else {
                System.out.println(Sale_name.concat("'s Sales Commission is "+(Sale_amount*0.02)));
                  }


    }
}
