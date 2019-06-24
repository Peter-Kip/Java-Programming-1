
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int i = 0;
        int sum = 0;
        
        System.out.print("Until what?: ");
        int finalNumber = Integer.parseInt(reader.nextLine());
        
        while (i < finalNumber) { 
            i++;
            sum = sum + i;
                    
        }
        System.out.println(sum);
    }
}
