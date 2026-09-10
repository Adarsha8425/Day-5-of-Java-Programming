package LogicalOperators;

public class ErrorCheck {
    public static void main(String[] args)
    {
        //int a = 10;// values
        //int b = 10;

        //if(a == b)
        /**if (a.equals(b))// this won't works .equals for primitive data type
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
            */

        String day = "Sunday";

        if (day.equals("Sunday"))//works for Objects and String as class which as Methods
        {
            System.out.println("Holiday");
        }
        else
        {
            System.out.println("Working day");
        }
    }
}
