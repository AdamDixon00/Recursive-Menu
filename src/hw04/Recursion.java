package hw04;

import java.util.ArrayList;
import java.util.List;

public class Recursion {
    
    private Recursion(){

    }
    
    public static int bunnyEars(int n){
        int ears = 0;

        if (n == 0){
            return ears;
        } else if(n % 2 == 0 && n != 0) {
            return  4+ bunnyEars(n-1);
        } else if(n % 2 == 1 && n != 0){
            return 5+ bunnyEars(n-1);
        }
        return ears;
    }

    public static double zenosRaceParadox(int n, double totalDistance){
        double distance = 0;
        if(n == 0){
            return 0;
        } else {
            distance = totalDistance/Math.pow(2, n);
            return distance + zenosRaceParadox(n-1, totalDistance);
        }
    }

    public static int subString(String string, String subStr){
        if (string.length() < subStr.length()){
            return 0;
        } else if(string.substring(0, subStr.length()).equals(subStr)){
            return 1 + subString(string.substring(subStr.length()), subStr);
        } else {
            return subString(string.substring(1), subStr);
        }
    }

        public static int pairSums(int[] arr, List<Integer> sums){
            if (arr.length == 1) { 
                return arr[0];
            } else { 
                List<Integer> newSums = new ArrayList<>();
                for (int i = 0; i < arr.length - 1; i++) {
                    newSums.add(arr[i] + arr[i+1]);
                }
                return pairSums(newSums.stream().mapToInt(Integer::intValue).toArray(), newSums);
            }
        }
        
}
