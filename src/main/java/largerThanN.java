/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0781317
 */
import java.util.Random;
public class largerThanN {
    
    public static void main(String[] args) {
        int[] arrayOne = new int[10];
        Random randomNumber = new Random();
        //Create and integer array
        //random numbers
        for(int i=0; i<10; i++){
            arrayOne[i]=randomNumber.nextInt(25);
        }
        //set n to some interger
        int n = randomNumber.nextInt(25);
        //run the method
        largerThanN(arrayOne, n);
    }
  //method to display numbers larger than n
    public static void largerThanN(int [] arrayOne, int n){
        for(int i=0; i<arrayOne.length;i++){
            if(arrayOne[i]>n)
                System.out.println(arrayOne[i]);
        }
    }
        
}
