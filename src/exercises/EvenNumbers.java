package exercises;

import java.util.Scanner;

/*Print Even numbers
* Remainder : r=num%2==0
* */
public class EvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a starting number: ");
        int startNum = input.nextInt();

        System.out.println("Enter ending number: ");
        int endNum = input.nextInt();

        //First initialization,condition is executed, then block, then increment is executed.
        //Below logic can be created both by for and while loops.
        for (startNum=0; startNum<=endNum;++startNum)
        {
            if (startNum%2==0)      //remainder = 0 is even, 1 is odd.
            {
                System.out.println(startNum);
            }
        }
    }
}
