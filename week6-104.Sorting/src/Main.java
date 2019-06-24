
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
  
    }
    
    public static int smallest(int[] array) {
        // write the code here
        int temp = array[0];
        for(int value : array){
            if(value < temp){
                temp = value;
            }
        }
        return temp;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        // code goes here
            int value = smallest(array);
            int indexOfTheSmallest = 0;
            
            for(int i = 0; i < array.length; i++){
                if(array[i] == value){
                    indexOfTheSmallest = i;
                }
            }
        return indexOfTheSmallest;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // write the code here
        int temp = array[index];
        int indexOfTheSmallestStartingFrom = index;
        
        for(int i = index; i < array.length; i++){
            if(array[i] < temp){
                temp = array[i];
                indexOfTheSmallestStartingFrom = i;
            }
        }
        return indexOfTheSmallestStartingFrom;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        // code goes here
        int temp = array[index1];
        int tempTwo = array[index2];
        
        array[index2] = temp;
        array[index1] = tempTwo;
        
    }
    
    public static void sort(int[] array) {
        int temp = 0;
        int index = 0;
        int index1 = 0;
        
        for(int i = 0; i < array.length; i++){
            index = indexOfTheSmallestStartingFrom(array, i);
            swap(array, index1, index);
            System.out.println(Arrays.toString(array));
            index1++;
        }
        
    }
    
}