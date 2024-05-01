import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LoopExample {

    public static void main(String[] args) {
        
        int day = 0;

        String[] nameDay = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thurday", "Friday", "Saturday"};
        

    /* 
            while (day <7) {

                int time = 1;
                while (time <=12) {
                    // System.out.println(nameDay[day]+" "+ time + ":00");
                    String timeValue = (time<10)? "0"+time+ ":00" : time+ ":00";
                    String resultString = (nameDay[day]).concat(" "+timeValue);
                    System.out.println(resultString);
                    time++;
                }

            day++;
                
            }*/

            for (String dayVal : nameDay) {
                int time = 1;
                while (time <=12) {
                    // System.out.println(nameDay[day]+" "+ time + ":00");
                    String timeValue = (time<10)? "0"+time+ ":00" : time+ ":00";
                    String resultString = dayVal.concat(" "+timeValue);
                    System.out.println(resultString);
                    time++;
                }
            }
    } 
    
}
