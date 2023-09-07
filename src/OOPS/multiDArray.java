package OOPS;

//Math.random gives us double values, hence below we are multiplying with 100.
public class multiDArray {
    public static void main(String[] args) {
        int[][] num = new int[5][7];

        for (int rowCount=0; rowCount<=3; rowCount++)
        {
            System.out.println("Row Count: " + rowCount);
            for (int columnCount=0; columnCount<=4; columnCount++)
            {
                num[rowCount][columnCount] = (int)(Math.random()*100);
                System.out.println(num[rowCount][columnCount]);
            }
        }
    }
}
