import java.util.*;

public class Array_Pair {
    public static void main(String[] args){
        int[] arr = {4, 9, 10, 7, 5};

        for(int i=0; i<arr.length; i++){
            int first = arr[i];
            for(int j=i+1; j<arr.length; j++){
                int second = arr[j];
                int sum = first +second;
                System.out.println("Making pair of " + first + " and " + second + " sum: " + sum);
            }
        }
    }
    
}
                                  