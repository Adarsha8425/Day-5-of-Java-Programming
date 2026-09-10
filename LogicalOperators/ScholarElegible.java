package LogicalOperators;

import java.util.Scanner;

public class ScholarElegible {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the Family Income : ");

        int family_income = sc.nextInt();
        System.out.println("Enter the Marks: ");
        int Marks = sc.nextInt();

        if (Marks <= 70 && family_income <= 100000)
        {
            System.out.println("Eligible for Scholarship");
        }
        else if(Marks >= 90 && family_income >= 110000)
        {
            System.out.println("Eligible for Scholarship more than 110000");
        }
        else
        {
            System.out.println("Apply for again");
        }
        sc.close();
    }
}
