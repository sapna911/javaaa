public class apnapat{
    public static void main(String[] args){
        /*for(int line=1; line<=4;line++){
           // System.out.println("*"
           for(int star=1; star<=line; star++){
            System.out.print(star);
           }
           System.out.println( );
        }*/

        for(int i=1; i<=4;i++){
            int n=4;
            for(int j=1; j<=(n-i+1); j++){
                System.out.print("*");
            }
             System.out.println( );
        }
    }
}