import java.util.Scanner;

public class PalindromNumberChecker {

    public static void main(String[] args) {

        boolean continueChecking = true;
        while (continueChecking) {
    

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter word:");
        String input = scanner.nextLine();
        
        if(palindromChecker(input)) {
            System.out.println(input+" is palindrome");
            
        }else{
            System.out.println(input+" is not palindrome");
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Do you want to check another word(yes/no):");
        String response = scanner.nextLine();
        if(!response.equalsIgnoreCase("yes")){
            continueChecking = false;
            System.out.println("Thanks for using Palindrome checker.");
        }

    }

    }

    public static boolean palindromChecker(String inputWord){
        
        inputWord = inputWord.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        StringBuilder reverseWord = new StringBuilder(inputWord).reverse();
        return inputWord.equals(reverseWord.toString());

    }
}

