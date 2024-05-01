public class SwitchExample {

    public static void main(String[] args) {
        
        int numDay = 1;
        String day = "Monday";
        String result = "";
        String result1 = "";


    //Traditional way.
     switch(numDay){

            case 1: 
            System.out.println("Sunday");
            break;
            case 2: 
            System.out.println("Monday");
            break;
            case 3: 
            System.out.println("Tuesday");
            break;
            default:
            System.out.println("invalid entry");
        }  

//New way....
       switch (day) {
            case "Sunday" ->  System.out.println(result = "Sunday");
            case "Monday" -> System.out.println(result = "Monday");
            case "Tuesday" -> System.out.println(result = "Tuesday");
            default -> System.out.println("Invalid Entry");
        } 
        System.out.println("result:"+ result);

        result1 = switch (day) {
            case "Sunday" : yield "Sunday";
            case "Monday" : yield "Monday";
            default : yield "Invalid Entry";
        };

        System.out.println("result1:"+ result1);

        
    }
    
}
