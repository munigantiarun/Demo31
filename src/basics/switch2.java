package basics;

public class switch2 {
    public static void main(String[] args)
    {
        String day = "Saturday";
        switch (day)
        {
            case "Friday", "Sunday":
                System.out.println("10AM - 10PM");
                break;
            case "Wednesday", "Saturday":
                System.out.println("Holiday");
                break;
            default:
                System.out.println("2PM-12AM");
        }
    }
}
