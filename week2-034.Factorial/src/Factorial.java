import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        int i = 1;
        int factorial = 1;
        
        while(i <= number){
            factorial *= i;
            i++;
        }
        System.out.println("fractorial is: "+ factorial);

    }
}
