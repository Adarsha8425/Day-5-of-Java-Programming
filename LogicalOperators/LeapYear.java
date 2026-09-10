package LogicalOperators;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The year : ");
        int year = sc.nextInt();

        if(year % 4 == 0)
        {
            System.out.println("It's a Leap year");
        }
        else if(year % 100 == 0)
        {
            System.out.println("It's Not a Leap year");
        }
        else if(year % 400 == 0)
        {
            System.out.println("It's a Leap year");
        }
        else
        {
            System.out.println("It's Not Leap year");
        }
        sc.close();
    }
}
