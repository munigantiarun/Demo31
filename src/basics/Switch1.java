package basics;

public class Switch1 {
    public static void main(String[] args)
    {
        int n = 9;

//        if(n==1)
//            System.out.println("Monday");
//        else if (n==2)
//            System.out.println("Tuesday");
//        else if (n==3)
//            System.out.println("Wednesdau");
//        else if (n==4)
//            System.out.println("Thursday");
//        else if (n==5)
//            System.out.println("Friday");
//        else if (n==6)
//            System.out.println("Saturday");
//        else if (n==7)
//            System.out.println("Sunday");

        switch (n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");

            default:
                System.out.println("Have a nice day");
        }
    }
}
