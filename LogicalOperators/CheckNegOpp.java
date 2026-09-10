package LogicalOperators;
import java.util.*;
public class CheckNegOpp {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();

        if (num > 0)
        {
            System.out.println("The Number is Positive");
        }
        else if (num < 0)
        {
            System.out.println("The Number is Negative");
        }
        else
        {
            System.out.println("The Number is Zero");
        }
        sc.close();
    }
}
