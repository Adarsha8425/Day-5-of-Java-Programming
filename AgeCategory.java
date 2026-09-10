package LogicalOperators;

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age : ");
        int age = sc.nextInt();

        if(age < 18)
        {
            System.out.println("He is Child");
        }
        else if(age >= 18 && age <= 35)
        {
            System.out.println("He is Adult");
        }
        else if(age >= 40 && age <= 60)
        {
            System.out.println("He is Senior");
        }
        else
        {
            System.out.println("He is Senior Citizen");
        }
        sc.close();
    }
}
