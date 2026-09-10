package LogicalOperators;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Numbers : ");
        int num = Sc.nextInt();

        if(num % 2 == 0)
        {
            System.out.println("The Number is Even");
        }
        else
        {
            System.out.println("The Number is Odd");
        }
        Sc.close();

    }
}
