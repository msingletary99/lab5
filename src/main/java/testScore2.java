/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0781317
 */
public class testScore2 {

    private double[] validScores;
    double sum=0;
    
    public testScore2(double gradesArray[]){
        for(int i = 0; i <gradesArray.length;i++){
            validScores= new double[gradesArray.length];
            if(gradesArray[i]<0 || gradesArray[i]>100){
                throw new IllegalArgumentException("Bad Grades: " + "\n Position: " + (i+1) + "\n Score: " + gradesArray[i]);
                
            }else{
                validScores[i]=gradesArray[i];
                sum= sum + gradesArray[i];
            }
            
        }
    }
    public double getAverage(){
        return sum/validScores.length;
    }
}
