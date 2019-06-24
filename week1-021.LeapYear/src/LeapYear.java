
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());;
        
        int leapYear1 = year % 4;
        int leapYear2 = year % 100;
        int leapYear3 = year % 400;
        
        
        if(leapYear1 == 0 && leapYear2 != 0) {
            System.out.println("The year is a leap year. ");
            
        }   else if(leapYear2 == 0 && leapYear3 == 0){
                System.out.println("The year is a leap year");
        }
            else{
                System.out.println("The year is not a leap year");
        }
    }
}
