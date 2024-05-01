import java.util.Scanner;

public class FactorialCalculator {
    
    public static void main(String[] args) {

        boolean checkAgain = true;
        while (checkAgain) {
            
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter to calculate its factorial:");
            try{
            int inputNum = sc.nextInt();
                if(inputNum > 0){
                    System.out.println("Result:"+ calcFactorial(inputNum));

                }else{
                    System.out.println("Please enter valid number.");
                    continue;
                }
            }catch(Exception ex){
                System.out.println("Please enter valid number.");
                continue;
            }

            System.out.println("Do you want to check for another number(Yes/No):");
            Scanner sc1 = new Scanner(System.in);
            String res = sc1.nextLine();
                if(res.equalsIgnoreCase("yes")){
                    checkAgain = true;
                }else{
                    checkAgain = false;
                }

        }


        
    }

    public static long calcFactorial(int num){

        int result = 1;
        for(int i=1;i<=num;i++){
            result *= i;
            System.out.println(result);
        }
        return result;
    }

}
