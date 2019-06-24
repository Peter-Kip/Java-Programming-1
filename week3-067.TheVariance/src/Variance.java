import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for(int a : list){
            sum += a;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        int count = 0;
        for(int a : list){
            count++;
        }
        return (double)sum(list)/count;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        int n = 0;
        double sum = 0;
        double variance = 0;
        double mean = average(list);
        
        for(int a : list){
           n++;
           sum += Math.pow(a - mean, 2);
           variance = sum/(n-1);
        }
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
