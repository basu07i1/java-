public class Practice_Array {

    public static int linearSearch(int arr[] , int target){
        for(int i = 0; i<arr.length; i++){
            if( arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    
    public static int getLargest(int arr[] ){
        int largest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];

            }
        }
        return largest;
    }
    
    public static int getSmallest(int arr[]){
        int smallest = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;

    }
    
    public static int CountOccurrences(int arr[] , int target){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                count++;
            }
            
        }
        return count;


    }
    
    public static boolean getBoolean(int arr[] , int target){
        for(int i=0; i<arr.length; i++){
            if( arr[i] == target){
                return true;
            }
        }
        return false;
    }
    
    public static int firstOccurence( int arr[] , int target){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;

    }
    
    public static int lastOccurence(int arr[] , int target){
        for(int i = arr.length-1; i >= 0; i--){
            if( arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    
    public static int getDuplicate(int arr[] ){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args){
        int arr[] = {2, 1,4,2,6, 8, 2 ,10,4,10};
        // int target= 4 ;

        // System.out.println(linearSearch( arr , target));
        // System.out.println(getLargest(arr));
        // System.out.println("smallest number is: "+ getSmallest(arr));
        // System.out.println("Occurrence number:" + CountOccurrences(arr, target));
        // System.out.println("If number Exist then return True either False:" + getBoolean(arr , target));
        // System.out.println("First Occurences number is :" + firstOccurence(arr, target));
        // System.out.println("Last Occurence Number:" + lastOccurence(arr, target));
        getDuplicate(arr);
    }
    
}
