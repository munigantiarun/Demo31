package basics;

class Calculator
{
    public int add(int a, int b)
    {
        System.out.println("abc");
        return a+b;
    }
}

class Computer
{
    public void playMusic()
    {
        System.out.println("Music");
    }

    public String getMeAPen(int cost)
    {
        if (cost >=5)
        {
            return "Here is your Pen";
        }
        else
            return "Pen costs atleast 5$";

    }
}

public class Objects1
{
    public static void main(String[] args) {
        int num1=2;
        int num2=5;
        /*creation of object.
        *ClassName refVar = newKeyword Constructor();
        *An object of type Calculator() is created using a ref variable calculator.
        * */
        Calculator calculator = new Calculator();
        int result = calculator.add(num1,num2);
        System.out.println(result);

        Computer computer = new Computer();

        computer.playMusic();
        //As we are returning a string in the getMeAPen method, we save it in a pen variable
        // of string type and then print it.
        String pen = computer.getMeAPen(1);
        System.out.println(pen);
    }
}
