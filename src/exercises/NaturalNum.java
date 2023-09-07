package exercises;

import java.util.Scanner;

/*Program to print natural numbers */
public class NaturalNum {
    public static void main(String[] args) {
        //For inputting a number we use scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a starting number: ");
        int startNum = input.nextInt();

        System.out.println("Enter an ending number: ");
        int endNum = input.nextInt();

        while (startNum<=endNum)
        {
            System.out.println(startNum);
            startNum++;
        }
    }
}
