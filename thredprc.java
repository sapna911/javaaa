class prc extends thread{
    void run(){
       // while(true){
           /*  try{
                int millis;
                thread.sleep(200);
            }
            catch(Exception){
                char[] e;
                System.out.println(e);
            }*/
           // System.out.println("welcome");

       // }
        
    }

    public void start() {
    }

    public void setpriority(int i) {
    }
}
class prcb extends thread{
    public void run(){
       /* while(true){
          
            System.out.println("good morning");
        }*/
    }

    public void start() {
    }

    public void setpriority(int i) {

        System.out.println("9" );
       

    }
}

public class thredprc{
    public static void  main(String[] args){
        prc p1=new prc();
       
        prcb p2=new prcb();
        p1.setpriority(6);
        //System.out.println("p1.getpriority");

        p2.setpriority(6);
       // System.out.println("p2.getpriority");
          //p1.run();
         // p2.run();

          
        
    }
}