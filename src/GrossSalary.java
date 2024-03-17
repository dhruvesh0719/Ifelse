// Programme to find Gross salary

import java.util.Scanner; // import from JAVA

public class GrossSalary //class name
{
    public static void main(String[] args) // main method of the class
    {
        Scanner scanner = new Scanner(System.in); // scanner object

        System.out.println("Entre the employee's ID");
        int Emp_ID = scanner.nextInt(); //input from user and stored as int variable

        System.out.println("Entre the employee's name");
        String Emp_name = scanner.next(); //input from user and stored as String variable

        System.out.println("Entre the employee's salary");
        double Emp_basic_salary = scanner.nextInt(); //input from user and stored as double variable

        double HRA = (Emp_basic_salary * 0.1); //logic to count HRA
        System.out.println(Emp_name.concat("'s HAR is "+HRA));

        double DA = (Emp_basic_salary * 0.08); //logic to count DA
        System.out.println(Emp_name.concat("'s DA is "+DA));

        double TA = (Emp_basic_salary * 0.09); //logic to count TA
        System.out.println(Emp_name.concat("'s TA is "+TA));

        double PF = (Emp_basic_salary * 0.2); //logic to count PF
        System.out.println(Emp_name.concat("'s PF is "+PF));

        double Gross_salary = (Emp_basic_salary + HRA + DA + TA - PF); //logic to count Gross salary
        System.out.println(Emp_name.concat("'s Gross Salary is "+Gross_salary));


    }
}
