public class Practice_Pattern {
    public static void hollow_rectangle(int rows , int cols) {
        //outer loop;
        for(int i =1 ; i<=rows; i++){
            //inner loop
            for(int j = 1; j<=cols; j++){
                //boundary cells
                if(i == 1 || i==rows || j == 1 || j == cols){
                    System.out.print(" * ");

                }else{
                    System.out.print("   ");

                }
            }
            System.out.println();         
        }
    }

    public static void inverted_rotated_half_pyramid(int n) {
        //line row
        for(int i = 1; i<=n; i++){
            //for spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");

            }
            // Print star
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void inverted_half_pyramid_withNumber(int n ){

    
        //outer line 
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyds_triangle(int n) {
        int counter = 1;
        //outer
        for(int i = 1; i<=n; i++){
            //how many time counter will printed
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0){//even condition.
                    System.out.print("1");
                } else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void Butterfly(int n){
        //1half
        for(int i = 1; i<=n; i++){
            //start
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //space
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //start
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        //2half 
        for(int i=n; i>=1; i--){
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //space
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //start
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
        public static void main(String args[]) {

            // hollow_rectangle(5, 5);
            // inverted_rotated_half_pyramid(5);
            // inverted_half_pyramid_withNumber(5);
            // floyds_triangle(5);
            // zero_one_triangle(5);
            Butterfly(5);
        
    } 
    
}
