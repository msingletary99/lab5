/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0781317
 */
public class testScores {
    
//    not exemptions
    public double[] testArray;
    public 
    double total = 0;
    public testScores(double[] testArray){
        for(int i=0; i<testArray.length;i++){
            if(testArray[i]<0||testArray[i]>100){
                throw new IllegalArgumentException("Bad Score:" + testArray[i] + " is not a valid test Score"); 
            }else{
                total=+testArray[i];
                
            }
        }
    }
    
    public double averageScore(){
     double average =  total/testArray.length;
     return average;
    }
    
}

