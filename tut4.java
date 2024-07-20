import java.util.Scanner;

public class tut4 {
    public static void main(String[]args){
        int age;
        System.out.println("ENTER YOUR AGE");
        Scanner sc = new Scanner(System.in);
        age =sc.nextInt();
        if(age>56){
            System.out.println("YOU ARE EXPERIENCED");
        }
        else if(age>46){
            System.out.println("YOU ARE SEMI-EXPRIENCED");
        }
        else if(age>36){
            System.out.println("you are semi-exeprienced");
        }
        else{
            System.out.println("YOU ARE NOT EXPRIENCED");
        }


    }
    
}
