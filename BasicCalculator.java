/**
 * InnerBasicCalculator
 */
class BasicCalculation extends AdvanceCalculator{

    public int add(int num1, int num2){

        return num1 + num2;
    }

    public int sub(int num1, int num2){

        return num1 - num2;
    }

    public int mul(int num1, int num2){

        return num1 * num2;
    }
    public int div(int num1, int num2){

        return num1/num2;
    }
    
}


public class BasicCalculator {
    public static void main(String[] args) {

        BasicCalculation bc = new BasicCalculation();
        System.out.println(bc.add(10, 20));
        System.out.println(bc.power(10,2));
        System.out.println(bc.tan(2));
        


        
    }
}
