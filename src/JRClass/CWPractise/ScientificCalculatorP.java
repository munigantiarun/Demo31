package JRClass.CWPractise;

import JRClass.CW.ScientificCalculator;

//Addition, Multiplication, Sum of Squares, Pythagoras.
//So we need +, *. squares = *, sqrt - Math.sqrt == Inputs we need one for squares, sum we need two.
//so we need constructor with single and two inputs.
public class ScientificCalculatorP extends CalculatorP{

    double a;
    double b;
    double c;

    //Below are the default, one and two input constructors.
    public ScientificCalculatorP() { super();}
    public ScientificCalculatorP(double ip1)
    {
        super();
        a = ip1;
    }
    public ScientificCalculatorP(double ip1, double ip2)
    {
        super();
        a = ip1;
        b = ip2;
    }

    public double addSquares()
    {
        return super.multiplyP(a,a) + super.multiplyP(b,b);
    }

    public double pythagorasP()
    {
        return Math.sqrt((super.multiplyP(a,a) + super.multiplyP(b,b)));
    }

}
