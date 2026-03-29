//Check if a number is Prime or not ;
public class Function_Prime{
    // public static boolean isPrime(int n){
    //     boolean isPrime = true;
    //     for(int i = 2; i<=n-1; i++){
    //         if(n % i == 0){
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }

    //Optimized way:-
    public static boolean isPrime(int n){
        if(n == 2) {
            return true;
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n) {
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String  args[]){
        primesInRange(20);
    }
}
