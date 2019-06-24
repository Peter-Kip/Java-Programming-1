import java.util.Scanner;
import java.util.ArrayList;
        
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order
        
      NumberStatistics stats = new NumberStatistics();
      NumberStatistics statsEven = new NumberStatistics();
      NumberStatistics statsOdd = new NumberStatistics();
      
      int number = 0;
      int evenNumber = 0;
      int oddNumber = 0;
        
        System.out.println("Type numbers:");
        while(true){
            number =Integer.parseInt(reader.nextLine());
            
            int modulus = number % 2;
            if(number < 0){
                break;   
            }else{
                stats.addNumber(number);
                if(modulus == 0){
                    evenNumber = number;
                    statsEven.addNumber(evenNumber);
                }else{
                    oddNumber = number;
                    statsOdd.addNumber(oddNumber);
                }
            }
            
        }
            System.out.println("sum: " + stats.sum());
            System.out.println("sum of even: " + statsEven.sum());
            System.out.println("sum: of odd: " + statsOdd.sum());
    }
}
