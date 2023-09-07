package JRClass.CW;

public class Main {
    public static void main(String[] args) {
        CalculatorR calculatorR = new CalculatorR();

        double sum1 = calculatorR.addR(2.3,7.8);
        System.out.println("Using the addR method from parent class, the sum is: "+ sum1);


        double productR = calculatorR.multiplyR(3.4, 4.4);
        System.out.println("Using the multiplyR method from parent class, product: " + productR);


        //Using two inputs constructor.
        ScientificCalculator scientificCalculator = new ScientificCalculator(25.0,2.0);
        double productSq = scientificCalculator.add2squares();
        System.out.println("Using the add2squares method from child class: " + productSq);


        //Refer 9/6/23 - 7:56PM time explanation from the class recording.
        //Using default scientificCalculator.java
        ScientificCalculator scientificCalculator1 = new ScientificCalculator();
        double result2 = scientificCalculator1.pythagTh(5.0,12.0);
        System.out.println(result2);


        double thirdSide = scientificCalculator.pythagTh(3,4);
        System.out.println("Using the pythagTh method from Child class: " + thirdSide);

    }
}
