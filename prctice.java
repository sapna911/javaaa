public class prctice{

    //PROBLEM 1
    /*static void multiplication(int n){
        for(int i=1; i<=10;i++){
            System.out.format("%d X %d = %d\n",n,i,n*i);
            
            }
        }

         public static void main(String[] args){
                multiplication(7);
    }*/


    //PROBLEM 2

    static void pattern1(int n){
        for(int i=1; i<=n;i++){
            for(int j=1; j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        pattern1(4);
    }
    
    
}
