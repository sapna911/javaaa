import java.util.Scanner;

public class apnaloop{
    public static void main(String[] args){
        /*int counter=0;
        while(counter<100){
            System.out.println("HELLO WORLD");
            counter++;
        }
        System.out.println("THESE HELLO WORLD PRINT 100 TIMES");

        // PRINT NUMBER BETWEEN  1 TO 10 BHY THE HELP OG WHILE LOOP

       /*  int counter=1;
        while(counter<=10){
            System.out.println(counter);
            counter++;
        }
        System.out.println("the number is print");

        // PRINT NUMBER BETWEEN 1 TO N 
        Scanner sc = new Scanner(System.in);
        int range= sc.nextInt();
        int counter=1;
        while(counter<=range){
            System.out.println(counter);
            counter++;
        }
        System.out.println("the number is printed successfully");
         Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            sum+=i;
            i++;
            System.out.println(sum);

        }        // FOR LOOP
        for(int i=1; i<=10; i++){
            System.out.println("hii");
        }
        // print square star by the help of for loop
        for(int line=1; line<=4; line++){
            System.out.println("****");
        }
        // PRINT REVERSE OF A NUMBER 
        int n=10899;
        while(n>0){
            int lastdigit=n%10;
            System.out.print(lastdigit);
            n=n /10;
        }
        System.out.println();

        //DO WHILE LOOP
        int counter=1;
        do{
            System.out.println("hello world");
            counter++;
        }
        while(counter<=10);

        // PRIME NUMBER 
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        if(n==2){
            System.out.println("number is prime");
        }

        else{
            boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.println("n is prime");
            }else{
                System.out.println("n is not prime");
            }
        }


        //PRACTICE QUESTIONS
        //public class Solution {
           // public static void main(String[] args){
           // for(int i=0; i<=5; i++) {
           // System.out.println("Hello");
            //i+=2;
           // }
            //}
            //}


            //import java.util.Scanner;
//public class Solution {
//public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int number;
int choice;
int evenSum = 0;
int oddSum = 0;
do {
System.out.print("Enter the number ");
number = sc.nextInt();
if( number % 2 == 0) {
evenSum += number;
} else {
oddSum += number;
}
System.out.print("Do you want to continue? Press 1 for yes or 0 for");

choice = sc.nextInt();
} while(choice==1);

System.out.println("Sum of even numbers: " + evenSum);
System.out.println("Sum of odd numbers: " + oddSum);
Scanner sc = new Scanner(System.in);
int num; // To hold number
int fact = 1; // To hold factorial
System.out.print("Enter any positive integer: ");
num = sc.nextInt();
for(int i=1; i<=num; i++) {
fact *= i;
}
System.out.println("Factorial: "+ fac*/

Scanner sc = new Scanner(System.in);
System.out.print("Enter number:");
int n = sc.nextInt();
for(int i=1; i<=10; i++) {
    System.out.println(n + " * " + i + " = " + n*i);


        
    }
}
}