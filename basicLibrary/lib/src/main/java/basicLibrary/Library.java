/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package basicLibrary;

import java.util.*;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.HashMap;
import java.util.HashSet;

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
    }

    public static String weatherData(int[][] arr){

        HashMap<String, Integer> response = new HashMap<>();
        Set<Integer> temps = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                temps.add(arr[i][j]);
            }
        }

//        List<Integer> list = new ArrayList<Integer>(temps);
//        Collections.sort(list);
//        System.out.println("sorted? " + list);

        for (Integer num : temps) {
            response.put("Never saw temperature: ", num);
//            System.out.println(response);
        }

        for (String i : response.keySet()){
            System.out.println("key: " + i + " value: " + response.get(i));
        }

        String result = "High: 72";
        return result;
    }
}
