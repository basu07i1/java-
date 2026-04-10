import java.util.*;
//Linear SSearch
public class ArraysCC {
    public static int linearSearch(int numbers[] , int key) {
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == key) {
                return i;

            }
        }
        return -1;
    }

    //largest number 
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        
        for(int i=0; i<numbers.length; i++) {
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = {2 , 4 , 6 , 8 , 10 , 12 , 14, 16};
        int key = 10;

        int index = linearSearch(numbers , key);
        if(index == -1){
            // System.out.println("Not Found");
        } else {
            // System.out.println("Key is at index");
        } 

        System.out.println("largest value is: " + getLargest(numbers));
    }
    
}
