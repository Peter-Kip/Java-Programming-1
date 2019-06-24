import java.util.Scanner;
public class FromOneToHundred {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write your program here
        int number = 1;
    
        while( number >= 1 && number <= 100){
            System.out.println(number);
            number++;
        }
        
    }
}
