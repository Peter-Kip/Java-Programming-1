
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());
        
        
        if(points == 0){
            System.out.println("Grade is: Failed");
            
        }   else if(points < 30){
                System.out.println("Grade is: Failed ");
        }
            else if(points < 35){
                System.out.println("Grade is: 1 ");
        }
            else if(points < 40){
                System.out.println("Grade is: 2");
        }
            else if(points < 45){
                System.out.println("Grade is: 3 ");
        }
            else if(points < 50){
                System.out.println("Grade is: 4 ");
        }
            else if(points < 61){
                System.out.println("Grade is: 5 ");
        }
    }
    
}
