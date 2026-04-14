import java.util.*;

public class Array_largest_smallest {
    public static int getSmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        

        for(int i=0; i < numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;

    }
    
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int numbers[] = {3, 7, 2, 9, 5};
        System.out.println(getLargest(numbers));
    }  
}
