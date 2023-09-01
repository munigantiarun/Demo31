package basics;

class Calculator
{
    public int add(int a, int b)
    {
        System.out.println("abc");
        return a+b;
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

    }
}
