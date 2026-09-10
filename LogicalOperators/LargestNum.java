package LogicalOperators;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers A : ");
        int num1, num2;
        num1 = sc.nextInt();
        System.out.println("Enter the Number B : ");
        num2 = sc.nextInt();

        if (num1 > num2)
        {
            System.out.println("The Num1 is Larger");
        }
        else
        {
            System.out.println("The Num2 is Larger");
        }
        sc.close();
    }
}


/**
 * InnerLargestNum
 */
class InnerLargestNum {

    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the numbers");

        int a, b, c;
        a = Sc.nextInt();
        b = Sc.nextInt();
        c = Sc.nextInt();

        if (a > b && a > c)
        {
            System.out.println("A is Larger");
        }
        else if (b > a && b > c)
        {
            System.out.println("B is Larger");
        }
        else
        {
            System.out.println("C is Larger");
        }
        Sc.close();
    }
}
