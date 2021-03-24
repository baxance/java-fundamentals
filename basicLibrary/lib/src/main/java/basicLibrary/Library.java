/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package basicLibrary;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Library {

    public static int[] roll(int n){
        int[] results = new int[n];
        System.out.println("LENGTH OF RESULTS ARRAY: " + results.length);
        for(int i = 0; i < results.length; i++) {
            int diceRoll = ThreadLocalRandom.current().nextInt(1, 6 +1);
            System.out.println("INDIVIDUAL DICE ROLLS: " + diceRoll);
            results[i] = diceRoll;
        }
        System.out.println("DICE ROLL RESULTS ARRAY : " + Arrays.toString(results));
        return results;
    }

    public static boolean containsDuplicates(int[] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static double calculateAverage(double[] arr){
        double total = 0;
        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
            System.out.println("TOTAL THIS LOOP: " + total);
        }
        System.out.println("LENGTH OF THE ARRAY: " + arr.length);
        double average = total / arr.length;
        System.out.println("AVERAGE OF ARRAY VALUES:");
        System.out.printf("%.2f%n", average);
        return average;
    }

    public static int[] calculateLowAverage(int[][] arr){
        double total = 0;
        double average;
        double[] arrayOfAverages = new double[arr.length];
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    total += arr[i][j];
//                        System.out.println(total);
                }
                average = total / arr[i].length;
//                System.out.println(average);
                arrayOfAverages[i] = average;
                total = 0;
                System.out.println("THIS IS THE AVERAGE: " + arrayOfAverages[i] + " at index: " + i);
            }
            int index = 0;
            double min = arrayOfAverages[index];
            for(int k=1;k<arrayOfAverages.length;k++){
                if (arrayOfAverages[k] < min){
                    min=arrayOfAverages[k];
                    index = k;
                }
            }
        System.out.println("ARRAY WITH SMALLEST AVERAGE: " + Arrays.toString(arr[index]));
            return arr[index];
//        int[] results = {55, 54, 60, 53, 59, 57, 61};
//        return results;
//        return arr[lowAverageArray];
    }

}

// WITNESS MY PAIN

//            for(int i=0;i<arr.length;i++){ // iterate through parent array
////                System.out.println(Arrays.toString(arr[i]));
//                for(int j=0;j<arr[i].length;j++){ // iterate through child arrays
////                    System.out.println(arr[i][j]);
//                    total += arr[i][j]; // sum the values of child array
////                    System.out.println(total);
////                    average = total / arr[i].length; // get average of child array
////                    System.out.println("THIS IS THE COMPARISON: " + small);
//                } average = total / arr[i].length; // get average of child array
//                averages[i] = average;
//                if (average > 0){
//                    average = 0;
//                }
//                System.out.println("THIS IS THE AVERAGE: " + averages[3]);
//                System.out.println(averages.length);

//                if (average < small) {
//                    small = average;
//                    average = 0;
//                } else if (average > small) {
//
//                }
//            }

//            for(int i=0;i<arr.length;i++){
//                for(int j=0;j<arr[i].length;j++){
//                    average = ((average + arr[i][j]) / arr[i][arr[j].length]);
//                    System.out.println("AVERAGE: " + average);
//                } if (average < comparison) {
//                    comparison = average;
//                    average = 0;
//                    lowAverageArray = i;
//                    System.out.println("COMPARISON: " + comparison);
//                    System.out.println("LOWEST ARRAY" + lowAverageArray);
//                }
//            }


//        for(int i=0;i<arr.length;i++){
//            for (int number : arr[0]) {
//                System.out.println(Arrays.toString(arr[i]));
//                average += number;
//            } if (average < comparison) {
//                comparison = average;
//                average = 0;
//                lowAverageArray = i;
//                System.out.println(comparison);
//                System.out.println(average);
//                System.out.println("LOWEST ARRAY" + lowAverageArray);
//            }
//        }
//        int[] results = {55, 54, 60, 53, 59, 57, 61};
//        return results;
//        return arr[lowAverageArray];
//      }
//  }

