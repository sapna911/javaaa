import java.util.Scanner;

public class tryprc{
    public static void main(String[] args){
        //PROBLEM 1
        //Syntax error-int a=7
        /*int age =78;
        int year_born =2000-78; ///logical error
        System.out.println(6/0);*/

        /// PROBLEM 2
       /* try{
            int a=666/0;
        }
        catch(IllegalArgumentException e){
            System.out.println("heheh");
        }
        catch(ArithmeticException e){
            System.out.println("hahahahaa");
        
        }*/

        // PROBLEM 3
        boolean flag =true;
        int[] marks = new int[3];
        marks[0] =7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner Sc =new Scanner(System.in);
        int index;
        int i= 0;


        while(flag && i<5){
            try{
                System.out.println("ENTER THE VALUE OF INDEX");
            index = Sc.nextInt();
            System.out.println("the value of marks[index] is" +marks[index]);
            break;
            }
            catch(Exception e){
                System.out.println("Invalid index");
                i++;

            }

        }
    }
}