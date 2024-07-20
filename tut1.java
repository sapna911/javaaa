import java.util.Scanner;

public class tut1{
    public static void main(String[] args){
       /*  System.out.println("HELLO WORLD\n THIS line is EXECUTE IN THE next LINE");
         //System.out.println("this line execute in the next line");

       // 2. SUM OF TWO NUMBER
         int a=74;
         int b=36;
         int sum = a+b;
         System.out.println(sum);

         //3.DIVIDE TWO NUMBER
         int a=50;
         int b=3;
         int div=a/b;
         System.out.println(div);

         //4.
         System.out.println(-5 + 8 * 6);
          System.out.println( (55+9) % 9
          );
           System.out.println(20 + -3*5 / 8);
            System.out.println( 5 + 15 / 3 * 2 - 8 % 3);
             System.out.println("hehhheh");

             //5.user given input
             Scanner sc= new Scanner(System.in);
             System.out.println("ENTER THE FIRST NUMBER:");
             int a=sc.nextInt();

              System.out.println("ENTER THE SECOND NUMBER:");
             int b=sc.nextInt();

             int sum=a+b;
             int sub=a-b;
             int mul=a*b;
             int div=a/b;
             int mod=a%b;

             System.out.println(sum);
             System.out.println(sub);
             
             System.out.println(mul);
             System.out.println(div);
             
             System.out.println(mod);
             System.out.println("bye bye!");

             //6.table of a any random number

             Scanner sc = new Scanner(System.in);
             System.out.println("enter a number:");
             int num1= sc.nextInt();
             for(int i=0;i<10;i++){
                System.out.println(num1+"x"+(i+1)+"="+(num1 * (i+1)));
             }
             //7

             System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
        );
        System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));*/
        double radius =7;
        //AREA OF A CIRCLE =PIA *R^2
         double area= (Math.PI*radius*radius);
         System.out.println(area);
         //perimeter of a circle = 2*pia*r
         double peri=2*Math.PI*radius;
         System.out.println(peri);
    }
}