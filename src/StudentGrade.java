//Programme to find Student's Grade

import java.util.Scanner; // import from JAVA

public class StudentGrade // class name
{
    public static void main(String[] args) // main method
    {
        Scanner scanner = new Scanner(System.in); //created scanner object

        System.out.println("Entre the student's  name"); //input from user and stored in String variable
        String Student_name = scanner.next();

        System.out.println("Entre the student's roll no"); //input from user and stored in int variable
        int Student_roll_no = scanner.nextInt();

        System.out.println("Entre the student's English mark"); //input from user and stored in int variable
        int Student_English = scanner.nextInt();

        System.out.println("Entre the student's Maths mark"); //input from user and stored in int variable
        int Student_Maths = scanner.nextInt();

        System.out.println("Entre the student's Science no"); //input from user and stored in int variable
        int Student_Science = scanner.nextInt();

        double total = (Student_English + Student_Maths + Student_Science); //adding all subject
        double percentage = (total/(300)*100); //finding percentage

        System.out.println(Student_name.concat("'s total marks is :"+total));
        System.out.println(Student_name.concat("'s percentage is :"+percentage));

        if(percentage >= 35) //condition checking
        {
            System.out.println(Student_name.concat(" is PASS"));
            if(percentage >= 80) //nested if condition to check further condition
            {
                System.out.println(Student_name.concat("'s grade is A+"));

            }else if(percentage >= 60)
            {
                System.out.println(Student_name.concat("'s grade is A"));
            }else if(percentage >= 50)
            {
                System.out.println(Student_name.concat("'s grade is B"));
            }else if(percentage >= 35)
            {
                System.out.println(Student_name.concat("'s grade is C"));
            }

        }else{
            System.out.println(Student_name.concat(" is FAIL"));
        }

    }

}
