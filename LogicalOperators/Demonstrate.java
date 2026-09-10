package LogicalOperators;

public class Demonstrate {
    public static void main(String[] args)
    {
        // scenorio 1 Both String Litrals
        String S1 = "Saturday";
        String S2 = "Saturday";

        System.out.println("Scenorio 1 Both Litrals");
        if(S1 == S2)
        {
            System.out.println("Equals");
        }
        else
        {
            System.out.println("Not Equal");
        }

        System.out.println(S1.equals(S2));

        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println("Scenorio 2 Both Using New");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println("Scenorio 3 Both Using String and New");
        String S3 = "java";
        String S4 = new String("java");

        System.out.println(S3 == S4);
        System.out.println(S3.equals(S4));
    }
}
