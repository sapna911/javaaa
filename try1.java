public class try1{
    public static void main(String[] args){
        int a=3000;
        int b=0;
        try{
            int c= a/b;
            System.out.println("the result is "+ c);
        }
        catch(Exception exception){
             System.out.println("WE failed to divide.reason:");
             System.out.println(exception);
            
        }


         System.out.println("end of program");

    }
}