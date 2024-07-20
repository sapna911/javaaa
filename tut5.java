import java.util.Scanner;

public class tut5 {
    public static void main(String[] args){
        int age;
        System.out.println("ENTER ANY NUMBER");
        Scanner sc = new Scanner(System.in);
        age=sc.nextInt();
        switch(age){
            case 18:
            System.out.println("YOU ARE GOING TO BECOME AN ADULT");
            break;
            case 23:
            System.out.println("YOU ARE GOING TO JOIN A JOB");
            break;
            case 60:
            System.out.println("YOU ARE GOING TO RETIRED");
            break;
            default:
            System.out.println("enjoy your life");

        }
        System.out.println("thanks for my java code");
    }
    
}
