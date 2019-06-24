import java.util.Scanner;

public class EvenNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write your code here
        int number = 2;
        
        while( number >= 2 && number <= 100){
            System.out.println(number);
            number = number +2;
            
            
        }
    }
}
