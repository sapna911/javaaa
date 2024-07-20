import java.util.Scanner;

public class ex1{
    public static void main(String[]args){

        float eng,phy,chem,math,comp;
        double total,average,percentage;
        try (Scanner op = new Scanner(System.in)) {
            /*INPUT MARKS OF ALL FIVE SUBJECTS*/
            System.out.println("ENTER MARKS OF FIVE SUBJECTS:");

            System.out.println("ENTER MARKS OF ENGLISH SUBJECTS:");
            eng=op.nextFloat();

            System.out.println("ENTER MARKS OF PHYSICS SUBJECTS:");
            phy=op.nextFloat();
            
            System.out.println("ENTER MARKS OF CHEMISTRY SUBJECTS:");
            chem=op.nextFloat();
            
            System.out.println("ENTER MARKS OF MATH SUBJECTS:");
            math=op.nextFloat();

            System.out.println("ENTER MARKS OF COMPUTER SUBJECTS:");
            comp=op.nextFloat();
        }
        

        /* CALCULATE TOTAL ,AVERAGE AND PERCENTAGE*/ 

        total=eng+phy+chem+math+comp;
        average=(total/5.0);
        percentage=(total/500.0)*100;

        /*PRINT ALL RESULTS*/
        System.out.println("Total marks="+total);
        System.out.println("Average marks="+average);
        System.out.println("Percentage="+percentage);

        
        

    
        
    }
}