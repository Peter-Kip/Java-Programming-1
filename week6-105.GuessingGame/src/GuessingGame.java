import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);

        // write the guessing logic here
        while(lowerLimit <= upperLimit){
            int average = average(lowerLimit, upperLimit);
            System.out.println("Average is: "+ average);
            System.out.println("L: "+lowerLimit);
            System.out.println("U: "+upperLimit);
            
            if((lowerLimit == upperLimit)){
                System.out.println("The number you're thinking of is "+ average);
                System.out.println("ll "+ lowerLimit + " av " + average + " ul " + upperLimit);
                break;
            /*}else if((lowerLimit == average)){
                System.out.println("The number you're thinking of is "+ upperLimit);
                System.out.println("ll "+ lowerLimit + " av " + average + " ul " + upperLimit);
                break; */  
            }else if((upperLimit == average)){
                System.out.println("The number you're thinking of is "+ lowerLimit);
                System.out.println("ll "+ lowerLimit + " av " + average + " ul " + upperLimit);
                break;
                
            }else if(isGreaterThan(average)){
                System.out.println("ll "+ lowerLimit + " av " + average + " ul " + upperLimit);
                // you have to increment the lower limit one above the average
                lowerLimit = average+1;
                
            }else {
                System.out.println("ll "+ lowerLimit + " av " + average + " ul " + upperLimit);
                upperLimit = average;
            }
        }
        
    }

    // implement here the methods isGrea+terThan and average
    public boolean isGreaterThan(int value){
        System.out.println("Is your number greater than "+ value +"? (y/n)");
        String answer = reader.nextLine();
        
        if(answer.equals("y")){
            return true;
        }
            return false;
    }
    
    public int average(int firstNumber, int secondNumber){
        
        return (firstNumber + secondNumber)/2;
    }
    
    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
  
}
