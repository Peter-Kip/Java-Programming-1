
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
        int index = 0;
        
       while(true){
           System.out.print("Type a word: ");
           String newWord = reader.nextLine();
         
               if(words.contains(newWord)){
                   System.out.println("You gave the word " + newWord + " twice");
                   break;
               }else
                   words.add(newWord);

           }   
    } 
}
