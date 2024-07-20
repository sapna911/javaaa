import java.util.*;
public class apnalar{
   

     public static int getlargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length; i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }


    
     public static int getlargest1(int numbers[]){
        int largest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length; i++){
            if(largest>numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int numbers[]={5,6,7,34,56,};
       //int[] numbers;
     System.out.println("lowest value is:" + getlargest1(numbers));
       System.out.println("largest value is:"+ getlargest(numbers));
      // System.out.println("lowest value is:"+ getlowest(numbers));
    }
}