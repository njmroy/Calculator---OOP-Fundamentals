package calculator;

public class IntCalc
{
    
            
    private int num1,num2;
    

    public IntCalc()
    {

        
    }
    
    public IntCalc(int num1, int num2)
    {
        this.num1=num1;
        this.num2=num2;
    }
    
    
    
 

    public int add(int num1, int num2) {
        System.out.println(num1+" plus "+num2+" equals "+ (num1+num2) );
        return num1+num2;
    }
    
    public int subtract(int num1, int num2) 
    {
        System.out.println(num1+ " minus "+num2+" equals "+ (num1-num2) );
        return num1-num2;
        
    }
    
    public int divide(int num1, int num2) {
        {
            System.out.println(num1+" divided by "+num2+" equals "+ num1/num2);
            return num1/num2;
        }
    }
    
    public int multiply(int num1, int num2) {
        System.out.println(num1+" multiplied by "+num2+" equals " +  (num1*num2));
        return num1*num2;
    }
    
    public int square(int num1) {
        System.out.println(num1+" squared is "+num1*num1);
        return num1*num1;
    }
    
}
