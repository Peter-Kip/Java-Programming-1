
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kiplagat
 */
public class Scores {
    private ArrayList<Integer> scores;
    
    public Scores(){
        scores = new ArrayList<Integer>();
    }
    
    public void inputScores(){
        Scanner reader = new Scanner(System.in);
        
        while(true){
            int score = Integer.parseInt(reader.nextLine());
            //if(score > -1 && score < 61){
            if(0 <= score && score <= 60){
                scores.add(score);
            }
            if(score == -1){
                break;
            }
        }  
    }  
    public static int[] grade(ArrayList<Integer> scores){
        
        int[] grade = {0, 0, 0, 0, 0, 0};
        
        for(int score : scores){
                if(score < 30){
                        grade[0]++;
                }
                else if(30 <= score && score < 35){
                    grade[1]++;
                }
                else if(35 <= score && score < 40){
                    grade[2]++;
                }
                else if(40 <= score && score < 45){
                    grade[3]++;
                }
                else if(45 <= score && score < 50){
                    grade[4]++;
                }
                else { //if(score <= 60){
                    grade[5]++;
                }
            }
        return grade;
    } 
     
    public void printScores(){
        int[] points = grade(scores);
        int grade = 5; 
        
        System.out.println("Grade distribution: ");
        for (int point : points){
            System.out.print(point);
            
        }
        System.out.println();
        
        // loop throught every grade, from 0 to 5
        for(int i = points.length -1; i >= 0; i--){
            // would you need a parameter to be given for the printStars function?
            // the number of starts *should be* different for each grade
            System.out.println(grade + ": "+ points[i] + " " +  getStars(grade));
            grade--;
        } 
        
        System.out.println("Acceptance percentage: "+ this.acceptedPoints());
    }
    
    public double acceptedPoints(){
        
        // acceptance rate
        // (points between 1-5) / sum of points
        
        int[] points = grade(scores);
        int acceptedPoints = 0;
        int sumOfPoints = 0;
      
        
        for(int i = 1; i < points.length; i++){
                acceptedPoints += points[i]; // points between 1 and 5s
        }
        for(int j = 0; j < points.length; j++){
                sumOfPoints += points[j];  // sum of pointss
                
        }
        
        if(acceptedPoints <= 0 || sumOfPoints <= 0){
            return 0;
        }else
            // error might be in heres
            // case 34: 
            // AP: 1
            // totalscores: 1
            System.out.println("AP: "+acceptedPoints);
            System.out.println("TP: "+sumOfPoints);
            return 100 * (acceptedPoints/(double)sumOfPoints);
    }
    
    /**
     * 
     * @param grade the grade we want to print
     * @return amount of stars
     */
    public String getStars(int grade){
       // take the grade distribution
       int[] points = grade(scores);
       String stars = "";
            
       // if grade is valid, meaning it is in the range (from 0 to 5)
       if(0 <= grade && grade < points.length) {
            // take the number of grades (e.g. total amount of grade 1)
            int starCount = points[grade];
            // as many stars there are to be printed, loop and
            // concatenate stars at the end of string
            for(int i = 0; i < starCount; i++){
                stars += "*";
            }   
        }
       // return stars
       return stars;

    }
}

