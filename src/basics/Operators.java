package basics;


public class Operators {
    public static void main(String[] args)
    {
        int num = 5;

        //num = num + 9;
//        num+=9;

//        int postResult = num++;     //First fetches the value and then increments.
//        System.out.println(postResult);

        int preResult = ++num;    //First increments the value and then fetches it.
        System.out.println(preResult);

    }
}
