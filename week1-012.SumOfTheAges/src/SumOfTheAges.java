
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.print("Type your name: ");
        String nameOne = reader.nextLine();
        
        System.out.print("Type your age: ");
        int ageOne = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type your name: ");
        String nameTwo = reader.nextLine();
        
        System.out.print("Type your age: ");
        int ageTwo = Integer.parseInt(reader.nextLine());
        
        int totalAge = ageOne + ageTwo;
        
        String toPrint = (nameOne + " and " + nameTwo +" are " + totalAge + " years old in total");
        System.out.println(toPrint);
        
    }
}
