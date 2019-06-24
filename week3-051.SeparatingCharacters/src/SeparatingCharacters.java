
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int i = 0;
        int j = 1;
        
        while(i <= name.length()-1){
            char character = name.charAt(i);
            System.out.println(j + ". character: "+ character);
            i++;
            j++;
    }
    }
}
