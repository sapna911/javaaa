import java.util.Scanner;

public class prc3 {
    public static void main(String[] args){
        int n;
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the number you want to check:");
            n=s.nextInt();
        }
        if(n%2==0){
            System.out.print("the given number"+n+"is even");

        }
        else{
            System.out.print("the given number"+n+"is odd");


        }
        

    }
    
}
