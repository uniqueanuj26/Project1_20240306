
public class Calculator {
    

    public static void main(String[] args) {

        calculate cal = new calculate();
        int result = cal.add(10, 20);
        int result1 = cal.add(10, 30,40);
        cal.subtract(40,30);
        System.out.println("result:"+result);
        System.out.println("result1:"+result1);
        
        
    }
}

class calculate {

    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    public void subtract( int num1, int num2){
        System.out.println("result:"+(num1 - num2));
    }

}
