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
    printPairs(numbers);
    
}
}
