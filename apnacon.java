import java.util.Scanner;

  public class apnacon{
    public static void main(String[] args){
      /*   int age=14;
        if(age>=18){
            System.out.println("adult:DRIVE,VOTE");
        }
        if(age>=13 && age<18){
            System.out.println("teenager");
        }

        else{
            System.out.println("no drive,no vote");
        }

        // EVEN AND ODD NUMBER
        Scanner sc = new Scanner(System.in);
                System.out.println("enter any number");
        int n =sc.nextInt();

       /* if(n%2==0){
            System.out.println("THE NUMBER IS :even number");
        }
        else{
            System.out.println("odd number:");
        }

         Scanner sc = new Scanner(System.in);
         int income=sc.nextInt();
         int tax;
         if(income<500000){
            tax=0;
         }
         else if(income>500000 && income<1000000){
            tax=(int)(income*0.2);
         }

         else{
            tax=(int)(income*0.3);

         }
         System.out.println("Your tax is :"+ tax);
         
        Scanner sc=new Scanner(System.in);
        int A   =sc.nextInt();
         int B  =sc.nextInt();
          int C  =sc.nextInt();

          if((A>=B)&&(A>=C)){
            System.out.println("A IS GREATHER THEN APMONG THESE THREE NUMBER");
          }
          else if(B>=C){
            System.out.println("B IS GRETHER THEN AMONG THESE THREE NUMBER");
          }
          else
          System.out.println("C IS GREATHER THEN AMONG THESE THREE NUMBER");
          */
         /*  int marks=67;
          String number = marks>=33? "pass":"fail";
          System.out.println(number);*/



          //SWITCH STATMENT
         /*  int number=8;
          switch(number){
            case 1: System.out.println("samosha");
            break;
            case 2:System.out.println("burger");
            break;
            case 3: System.out.println("shake");
            default:System.out.println("wake up");
          }*/

          //CALCULATOR BY THE HELP OF SWITCH STATEMENT
          Scanner sc = new Scanner(System.in);
          //System.out.println("enter the number of a:");
          int a=sc.nextInt();
          int b= sc.nextInt();
          char operator = sc.next().charAt(0);
          switch(operator){
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*':System.out.println(a*b);
            break;
            case '/':System.out.println(a/b);
            break;
            case '%':System.out.println(a%b);
            break;
            default:System.out.println("kya hi batau?");
          }

    }
}