import java.util.Scanner;

public class apnafun{
    // Create a function
    /*public static void printhelloworld(){
        System.out.println("hello world");

        return;  //if the cretae of function present int in place of void then (return 1;  means return number jitni baar functionko call kiya jata but jb void aata hai to kuch v retyrn krne ki need nhi hoti hai 

    }
    /*public static void calculator(int num1,int num2){//parameter and formal parameter
       
        int sum=num1+num2;
        System.out.println("sum is:"+sum);

    }

    public static int product(int a,int b){//parameter and formal parameter
       
        int product=a*b;
        return product;
    }

    public static void main(String[] args){
        /*  Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        //printhelloworld();
        int a=3;
        int b=5;
        int prod=product(a,b);
        System.out.println("a*b="+prod);
        //product(a,b);
         //calculator(a,b);//argument and actual parameter
         public static int fact(int n){
            int f=1;
            for(int i=1;  i<=n; i++){
                f = f*i;
                //return f;
            }
            return f;
            
         }
         public static int bio(int n,int r){
            int fact_n=fact(n);
            int fact_r=fact(r);
            int fact_nmr=fact(n-r);
            int bio = fact_n/(fact_r*fact_nmr);
            return bio;
         }*/
         //SAME FUNCTION NAME AND DIFFRENT PARAMETER 
         /*public static int sum(int a,int b,int c){
            return a+b+c;
         }
         public static int sum(int a,int b){
            return a+b;
         }*/

         //OVERLOADING DATA TYPEES
         public static int sum(int a,int b){
            return a+b;

         }
         public static float sum(float a,float b){
            return a+b;
         }
          
        public static void main(String[] args){
             //System.out.println(fact(4));
            //System.out.println(bio(5, 2));
            //System.out.print(sum);
            //System.out.println(sum(4, 5));
            System.out.println(sum(3, 6));
            System.out.println(sum(3.1f, 2.5f));
            
          }
}

