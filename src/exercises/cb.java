package exercises;

import java.util.Scanner;

public class cb {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);

        System.out.println("Enter your starting number: ");
        int startNum = inputNumber.nextInt();

        System.out.println("Enter your ending number: ");
        int endNum = inputNumber.nextInt();

        while (startNum<=endNum)
        {
            System.out.println(startNum);
            startNum = startNum+2;
        }

    }
}
