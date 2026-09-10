package LogicalOperators;

public class Loops {
    public static void main(String[] args)
    {   
        //int index;
        /*for(int index = 1; index <= 5; index++)
        {
            System.out.println("Algo");
        }
       for (int index = 1; index <= 5;) // infinte loop
       {
        System.out.println("Algo");
       }

        //step forward -- 2 even
        System.out.println("Print Even Numbers");
       for (int i = 2; i <= 10; i += 2) // even Numbers
       {
            System.out.println(i);
       }

       //step forword -- 2 odd
       System.out.println("Print Odd Numbers");
       for (int i = 1; i <= 10; i += 2) // odd numbers
       {
            System.out.println(i);
       }*/
        // step backward -- 1
        for(int index = 10; index >= 1; index--)
        {
            System.out.println(index);
        }

        System.err.println("Print Step backward -- 2");
        for(int index = 20; index >= 1; index -= 2)
        {
            System.out.println(index);
        }
    }
}
