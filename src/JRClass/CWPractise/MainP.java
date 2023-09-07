package JRClass.CWPractise;

public class MainP {
    public static void main(String[] args) {

        CalculatorP calculatorP = new CalculatorP();
        double sumP = calculatorP.addP(1.8,2.9);
        System.out.println(sumP);

        ScientificCalculatorP scientificCalculatorP = new ScientificCalculatorP(5.0,12.0);
        double sumOfSqr = scientificCalculatorP.addSquares();
        System.out.println(sumOfSqr);
        double underRootValue = scientificCalculatorP.pythagorasP();
        System.out.println(underRootValue);


    }
}
