import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        int number = 0;
        String password = "";
        String text = "abcdefghijklmnopqrstuvwxyz";
        
        while(i < this.length){
           i++;
           number = random.nextInt(26);
           password = password + text.charAt(number);
        }   
        return password;
    }
}
