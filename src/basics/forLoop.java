package basics;

public class forLoop {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++)
        {
            System.out.println("Outer loop " + i);
            for (int j=1;j<=2;j++)
            {
                System.out.println("inner loop "+ j);

            }
            System.out.println("*********************");
        }
    }
}
