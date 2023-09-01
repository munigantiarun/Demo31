package exercises;

import java.util.Scanner;

/*Program to write a table
* Tables (2,3,4,5...)*3=(6,9,12...)
* Here three variables multiples, and table. */
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);

        System.out.println("Enter a staring number: ");
        int startNum = inputNum.nextInt();

        System.out.println("Enter ending number: ");
        int endNum = inputNum.nextInt();

        System.out.println("Enter number for required table: ");
        int tableNum = inputNum.nextInt();

        while (startNum<=endNum)
        {
            System.out.println(startNum + "*" + tableNum + "=" + startNum*tableNum);
            startNum++;
        }

    }
}
