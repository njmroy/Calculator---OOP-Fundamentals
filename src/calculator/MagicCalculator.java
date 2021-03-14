package calculator;
import java.lang.Math;

public class MagicCalculator extends IntCalc
{
    public double sqrt(double num1) {
        System.out.println("Square root of "+num1+" equals "+ (Math.sqrt(num1)));
        return Math.sqrt(num1);
    }
    
    public double sin(double num1) {
        System.out.println("Sine of "+num1+ " equals "+Math.sin(num1));
        return Math.sin(num1);
    }
    
    public double cos(double num1) {
        System.out.println("Cosine of "+num1+ " equals "+Math.cos(num1));
        return Math.cos(num1);
    }    
    public double tan(double num1) {
        System.out.println("Tangent of "+num1+ " equals "+Math.tan(num1));
        return Math.tan(num1);
    }
   
    public double fact(double num1) {
        double result =1;
        double num1_copy = num1;
        for (int i=0;i<num1-1;i++) {
            result*=num1;
            num1--;
        }
        System.out.println("Factorial of "+num1_copy+" equals "+result);
        return result;
    }
}
