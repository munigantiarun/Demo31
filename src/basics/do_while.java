package basics;

public class do_while {
    public static void main(String[] args) {
        /*
        * When while condition is false, the code inside the loop doesn't execute.
        * even when the condition for while is false, when we would like to execute the code
        * inside the loop, we use DO keyword.
        * */
        int num = 6;
        do {
            System.out.println(num);
            num++;
        }while (num<=10);

        /*
        * Here in the above as num=6 is not satisfying the while condition,
        * so at least once the code is executed.
        * */




    }
}
