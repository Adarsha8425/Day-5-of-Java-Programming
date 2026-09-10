package LogicalOperators;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Calculator: ");
        int a, b;
        String Operators = sc.nextLine();
        a = sc.nextInt();
        b = sc.nextInt();
        switch (Operators) {
            case "add":// we can also use interger numbers such as 1, 2...etc
                int num1 = a + b;
                System.out.println("The Addition of Two Numbers is : " + num1);
                break;
            case "sub":
                System.out.println("The Substraction of Two Numbers is : " + (a - b));
                break;
            case "mul":
                System.out.println("The Multiplication of Two Numbers is : " + (a * b));
                break;
            case "div":
                System.out.println("The Division of Two Numbers is : " + (a / b));
                break;
            case "mod":
                System.out.println("The Modulus of Two Numbers is : " + (a % b));
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
        sc.close();
    }
}
