package calculator;


public class main
{

    public static void main(String[] args)
    {
        IntCalc myCalc = new IntCalc();
        int add = myCalc.add(2, 4);
        int sub = myCalc.subtract(2312, 31423);
        int mult = myCalc.multiply(99, 3);
        int div = myCalc.divide(888, 23);
        int sq = myCalc.square(22);
        
        MagicCalculator myCalc2 = new MagicCalculator ();
        
        double sqrt = myCalc2.sqrt(100);
        double sin1 = myCalc2.sin(32);
        double cos1 = myCalc2.cos(198);
        double tan1 = myCalc2.tan(232);
        double fact1 = myCalc2.fact(12);
        

    }

}
