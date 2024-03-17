//Programme to find Student pass or fail

import java.util.Scanner; // import from JAVA

public class StudentPassFail //class name
{
    public static void main(String[] args) //main method
    {
        Scanner scanner = new Scanner(System.in); //Created scanner class object

        System.out.println("Entre the student's  name");
        String Student_name = scanner.next(); //input from user and stored in String variable

        System.out.println("Entre the student's roll no");
        int Student_roll_no = scanner.nextInt(); //input from user and stored in String variable

        System.out.println("Entre the student's English mark");
        int Student_English = scanner.nextInt(); //input from user and stored in String variable

        System.out.println("Entre the student's Maths mark");
        int Student_Maths = scanner.nextInt(); //input from user and stored in String variable

        System.out.println("Entre the student's Science no");
        int Student_Science = scanner.nextInt(); //input from user and stored in String variable

        if (Student_English >= 35 && Student_Maths >= 35 && Student_Science >= 35) //Checking condition
        {
            System.out.println(Student_name.concat(" is PASS"));
        } else {
            System.out.println(Student_name.concat(" is FAIL"));
        }
    }
}
