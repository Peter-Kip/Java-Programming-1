
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        
        System.out.print("Length of the first part: ");
        int length2 = Integer.parseInt(reader.nextLine());
        int length1 = 0;
        
        String firstPart = word.substring(length1, length2);
        System.out.println("Result: "+ firstPart);
        
    }
}
