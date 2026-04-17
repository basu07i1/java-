import java.util.*;
public class Array_Practice {
    //Reverse Array
    public static void reverse(int numbers[]){
        int first = 0, last = numbers.length-1;

        while(first < last){
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first ++;
            last --;
        }

    }

    public static void printPairs(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int current = numbers[i]; //2 , 4,6, 8, 10
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("( "+ current + " , " + numbers[j] + ") ");

            }
            System.out.println();
        }
    }


    public static void SubArray(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int start = numbers[i];
            for(int j=i; j<numbers.length; j++){
                int end  = j;
                for(int k=start; k<= end; k++){
                    System.err.print( numbers[k] + " ");
                }
                System.out.println();

            }
            System.out.println();
        }
    }

    public static void BruteForce(int numbers[]){
        int max = numbers[0];
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
            
        }
        System.out.println(max);
    }
    
    
    
    public static void Target_Pair(int numbers[]){
        int target = 8;
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i] + numbers[j]  == target){
                    System.out.println("Pair Found:" + numbers[i]+ " : " + numbers[j]);
                }
            }
        }
    }
    public static void main(String args[]){

        int numbers[] = {2 , 4 , 6 , 8 , 10};
        /* 
        //Reverse
        reverse(numbers);
        for(int i = 0; i< numbers.length; i++){
            System.out.print(numbers[i] +" ");
        }
        System.out.println();
    
        */

    //Pair
    // printPairs(numbers);

    //subarray
    // SubArray(numbers);
    // BruteForce(numbers);
    Target_Pair(numbers);

    
}
}
