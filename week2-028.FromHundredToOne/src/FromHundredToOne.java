import java.util.Scanner;

public class FromHundredToOne {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write your program here
        int number = 100;
        
        while( number >= 1 && number <= 100){
            System.out.println(number);
            number--;
        }
    }
}
