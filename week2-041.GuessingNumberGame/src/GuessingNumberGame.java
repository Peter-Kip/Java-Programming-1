
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int number = 0;
        int guess = 1;
        
        while(number != numberDrawn){
            System.out.print("Guess a number: ");
            number = Integer.parseInt(reader.nextLine());
            
            if(number < numberDrawn){
                System.out.println("The number is greater, guesses made: "+guess);
                guess++;
            }else if(number > numberDrawn){
                System.out.println("The number is lesser, guesses made: "+guess);
                guess++;
            }else if(number == numberDrawn){
                System.out.println("Congratulations, your guess is correct");
                break;
            }
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
