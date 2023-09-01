package basics;

public class while1 {
    public static void main(String[] args) {
        //Code inside while loop executes only when while condition is true.
        int days = 1;
        while(days <=7)
        {
            System.out.println("Day " + days);
            days++;

            int hours=1;
            while (hours<=24)
            {
                System.out.println(hours + ":00 Hrs");
                hours++;
            }

        }
    }
}
