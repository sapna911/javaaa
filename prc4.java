import java.util.Scanner;

public class prc4 {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        double num1,num2,result;
        char operator;
        System.out.println("enter first number:");
        num1=scanner.nextDouble();

        System.out.println("enter second number:");
        num2=scanner.nextDouble();

        System.out.println("enter an opeartor(+,-,*,/):");
        operator=scanner.next().charAt(0);
        switch(operator){
            case '+':
            result=num1+num2;
            break;

            case '-':
            result=num1-num2;
            break;
            
            case '*':
            result=num1*num2;
            break;

            case '/':
            result=num1/num2;
            break;

            default:
            System.out.println("Invalid operator");
            return;
        }
        
        System.out.println(num1 +""+operator +"" + num2 +"="+result);
    }
    
}    
            
            

        





        
        
    
    

