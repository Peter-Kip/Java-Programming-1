
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here 
        
        System.out.print("Type the radius: ");
        int r = Integer.parseInt(reader.nextLine());
        
        double circumference = 2 * Math.PI * r;
        System.out.println("Circumference of the circle: " + circumference);
        
        
    }
}
