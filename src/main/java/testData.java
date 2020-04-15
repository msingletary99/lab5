/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0781317
 */
public class testData {

    public static void main(String[] args) {
        int[] testScores = new int[5];
        testScores[0] = 85;
        testScores[1] = 77;
        testScores[2] = 56;
        testScores[3] = 95;
        testScores[4] = 100;
        
        System.out.println("Your Test Statistics");
        System.out.println("===============================");
        int total = getTotal(testScores);
        System.out.println("Total: " + total);
        double average = getAverage(testScores);
        System.out.println("Average: " + average);
        int high = getHighest(testScores);
        System.out.println("Highest Score: " + high);
        int low = getLowest(testScores);
        System.out.println("Lowest Scores: " + low);
        

    }

    public static int getTotal(int[] testScores) {
        int total = 0;
        for (int i = 0; i < testScores.length; i++) {
            total = testScores[i] + total;
        }
        return total;
    }

    public static double getAverage(int[] testScores) {
        double average;
        int total = 0;

        for (int i = 0; i < testScores.length; i++) {
            total = testScores[i] + total;
        }

        average = total / testScores.length;
        return average;
    }

    public static int getHighest(int[] testScores) {
        int high = testScores[0];

        for (int i = 1; i < testScores.length; i++) {
            if (testScores[i] > high) {
                high = testScores[i];
            }

        }

        return high;
    }

    public static int getLowest(int[] testScores) {
        int low = testScores[0];
        for (int i = 1; i < testScores.length; i++) {
            if (testScores[i] < low) {
                low = testScores[i];
            }
        }
        return low;
    }
}
