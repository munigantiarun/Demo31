package JRClass.CW;

import JRClass.CW.CalculatorR;

public class ScientificCalculator extends CalculatorR {

    //defined a,b,c Fields - Default Global here in this ScientificCalculator class.
    double a;
    double b;
    double c;

    //Default Constructor
    public ScientificCalculator()
    {
        super();
    }

    //Constructor with single input.
    public ScientificCalculator(double input1)
    {
        super();
        a = input1;
    }

    //Constructor with two inputs.
    public ScientificCalculator(double input2,double input3)
    {
        super();
        b = input2;
        c = input3;
    }

    public double add2squares()
    {
        return super.multiplyR(a,a) + super.multiplyR(b,b);
    }

    public double pythagTh(double a, double b)
    {

        //return Math.sqrt((super.multiplyR(a, a)) + super.multiplyR(b, b));
        return Math.sqrt(super.addR(super.multiplyR(a,a), super.multiplyR(b,b)));
    }
}
