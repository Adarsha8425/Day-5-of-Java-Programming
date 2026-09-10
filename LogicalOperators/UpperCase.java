package LogicalOperators;
import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Character : ");
        int Ascii = sc.nextInt();
        char ch = (char) Ascii;
        String str = String.valueOf(ch);
        
        if (str.equals("E"))
        {
            System.out.println("UpperCase");
        }
        else
        {
            System.out.println("LowerCase");
        }
        sc.close();


        /**String str1 = sc.nextLine();
        if (str1.equals("E"))
        {
            System.out.println("UpperCase");
        }
        else
        {
            System.out.println("LowerCase");
        }*/

    }
}
