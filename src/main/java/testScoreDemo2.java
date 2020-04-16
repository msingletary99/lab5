/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0781317
 */
public class testScoreDemo2 {
    public static void main(String[] args) throws Exception {
        double[] goodStudent = {95.5, 85.5, 69.0, 72.0, 87.5};
        double[] badStudent = {15.0,12.3, 103.0, 99.0,-2.5};
        testScore2 test = null;
        
        try{
            test = new testScore2(badStudent);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        try{
            test = new testScore2(goodStudent);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("\n Good Scores:" + "\n The Average of the good scores is " + test.getAverage());
    }
}
