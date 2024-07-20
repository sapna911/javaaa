import java.util.Scanner;

public class apnaareasquare{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        /*int side=sc.nextInt();
        int area=side*side;
        System.out.println(area);*/

        float pencil=sc.nextFloat();
         float pen=sc.nextFloat();
          float copy=sc.nextFloat();
          float total=(pencil+pen+copy);
          System.out.println(total);
          float newtotal=(0.18f+total);
          System.out.println(newtotal);
    }
}