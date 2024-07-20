import java.util.*;
public class apnarev{
    public static void reverse(int number[]){
        int first=0,last=number.length-1;
        while(first<last){
            int temp=number[last];
            number[last]=number[first];
            number[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args){
        int number[]={45,7,8,9};
        //System.out.println("reverse(number);");
        reverse(number);
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
}