// Programme to display city name if user entre any value between a to f

import java.util.Scanner; // import from JAVA

public class CityName // class name
{
    public static void main(String[] args) // main method
    {
        Scanner scanner = new Scanner(System.in); //Scanner class object

        //Store cities name in variables
        String a = "Ahmedabad";
        String b = "Bombay";
        String c = "Chennai";
        String d = "Delhi";
        String e = "Elmah";
        String f = "Faridabad";

        //Get value from user and store in z
        System.out.println("Enter the any alphabet");
        char z = scanner.next().charAt(0);

        //Condition checking
        if(Character.toLowerCase(z) == 'a' || Character.toUpperCase(z) == 'A')
        {
            System.out.println("You entered "+z+" So, the city name is " +a);
        }else if(Character.toLowerCase(z) == 'b' || Character.toUpperCase(z) == 'B')
        {
            System.out.println("You entered "+z+" So, the city name is " +b);
        } else if(Character.toLowerCase(z) == 'c' || Character.toUpperCase(z) == 'C')
        {
            System.out.println("You entered "+z+" So, the city name is " +c);
        }else if(Character.toLowerCase(z) == 'd' || Character.toUpperCase(z) == 'D')
        {
            System.out.println("You entered "+z+" So, the city name is " +d);
        }else if(Character.toLowerCase(z) == 'e' || Character.toUpperCase(z) == 'E')
        {
            System.out.println("You entered "+z+" So, the city name is " +e);
        }else if(Character.toLowerCase(z) == 'f' || Character.toUpperCase(z) == 'f')
        {
            System.out.println("You entered "+z+" So, the city name is " +f);
        }else{
            System.out.println("Invalid Entry, Entre any alphabet from a to f");
        }
    }
}
