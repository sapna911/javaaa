public class programe{
    private static int n;
    static int factorial( int n){
        if(n==0|| n==1){
            return 1;
        }
        else{
            return n*factorial(n -1);
        }
        
    }
    public static void main(String[] args){
        System.out.println("the valuse of factorial n is :"+factorial(n));

    }
}
    

