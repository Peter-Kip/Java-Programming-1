import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the first number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type the second number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        
        int difference = firstNumber - secondNumber;
        
        if(difference > 0 ){
            System.out.println("Greater number: " + firstNumber);
            
        }   else if(difference < 0){
            System.out.println("Greater number " + secondNumber);
        }
            else if(difference == 0){
            System.out.println("The numbers are equal! ");
        }
        

    }
}
