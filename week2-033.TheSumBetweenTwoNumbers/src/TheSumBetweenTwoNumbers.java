
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int i = 0;
        int sum = 0;
        
        System.out.print("First?: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        
        System.out.print("last?: ");
        int lastNumber = Integer.parseInt(reader.nextLine());
        
        while (firstNumber <= lastNumber) { 
            sum = sum + firstNumber;
            firstNumber++;
                    
        }
        System.out.println(sum);
        
    }
}
