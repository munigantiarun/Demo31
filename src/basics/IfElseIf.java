package basics;

public class IfElseIf {
    public static void main(String[] args)
    {
        //Write a logic for printing the largest of three numbers.
        int x = 21;
        int y = 32;
        int z = 5;
        if(x>y && x>z)
        {
            System.out.println("x is the largest");
        }
        else if(y>z)
        {
            System.out.println("Y is the largest");
        }
        else
        {
            System.out.println("Z is the largest");
        }
    }
}
