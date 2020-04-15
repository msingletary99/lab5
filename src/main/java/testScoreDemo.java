/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0781317
 */
public class testScoreDemo {
    public static void main(String[] args) {
        double[] goodStudent = {95.5, 85.9, 69.2, 72.0, 87.5};
        double[] badStudent = {-15.0,12.3, 103.0, 99.0,-2.5};
        testScores tester = null;
        try
        {
            tester = new testScores(goodStudent);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        } 
        System.out.println("Good Scores! Your average score is " + testScores.averageScore());
        
        
        
        
        
    }
    
}
