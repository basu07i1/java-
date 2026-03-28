public class Function{
    static void swap(int a , int b){
        int temp = a;
        a =  b;
        b = temp;
    }

    public static void main(){
        int x = 10 , y = 20;
        swap(x , y); 
        System.out.println(x + " " + y);
    }
}
