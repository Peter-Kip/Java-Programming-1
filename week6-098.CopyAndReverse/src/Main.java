
import java.util.Arrays;



public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
        }
    
    public static int[] copy(int[] array) {
        int length = array.length;
        int[] copied = new int[length];
        
        for(int i = 0; i < length; i++){
            copied[i] = array[i];
        }
        return copied;
    }
    
    public static int[] reverseCopy(int[] array){
        int length = array.length;
        int[] reverse = new int[length];
        
        int i = 0;
        for(int j = length-1; j >= 0; j--){
            reverse[i] = array[j];
            i++;
        }
        return reverse;
    }
}


