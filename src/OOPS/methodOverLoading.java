package OOPS;

/*
* Below we use the same method name "add()" with different parameters,
* this is called Method Overloading.
* */

class Calculator{
    public int add(int n1, int n2, int n3)
    {
        return n1+n2+n3;
    }
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public double add(double n1, double n2)
    {
        return n1+n2;
    }

}
public class methodOverLoading {
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        int result = calculator.add(2,6);
        System.out.println(result);
    }

}


