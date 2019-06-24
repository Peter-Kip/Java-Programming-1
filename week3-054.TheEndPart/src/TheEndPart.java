import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        
        System.out.print("Length of the end part: ");
        int length1 = Integer.parseInt(reader.nextLine());
        
        int length2 = word.length();
        int length3 = length2 -length1;
        
        String endPart = word.substring(length3);
        System.out.println("Result: "+ endPart);
    }
}
