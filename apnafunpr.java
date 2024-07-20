import java.util.Scanner;

public class apnafunpr{

   /*  public static boolean iseven(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }*/

    public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;
        while (palindrome != 0) {
        int remainder = palindrome % 10;
        reverse = reverse * 10 + remainder;
        palindrome = palindrome / 10;
        }
        return false;
    }
    public static void main(String[] args){

        //PROBLEM 1
    Scanner sc = new Scanner(System.in);
    /* 
System.out.print("Input the first number: ");
double x = sc.nextDouble();
System.out.print("Input the second number: ");
double y = sc.nextDouble();
System.out.print("Input the third number: ");
double z = sc.nextDouble();
System.out.print("The average value is " + average(x, y, z)+"\n" );
}
public static double average(double x, double y, double z) {
return (x + y + z) / 3;

//problem 2
        int num;
        System.out.println("ENTER A NUMBER: ");
         num=sc.nextInt();
         if(iseven(num)){
            System.out.println("numberis even");
         }
         else{
            System.out.println("number is odd");
         }*/


         // problem 4

         System.out.println("Please Enter a number : ");
//Scanner sc = new Scanner(System.in);
int palindrome = sc.nextInt();
if(isPalindrome(palindrome)) {
System.out.println("Number : " + palindrome + " is a palindrome");
} else {
System.out.println("Number : " + palindrome + " is not a palindrome");
}



}
}

