class mythr extends thread{
    public mythr(String name){
        super();
    }
    public void run(){
        int i= 34;
        System.out.println("thknki");
        while(true){
            System.out.println("i am thred");
        }
    }
    public void start() {
    }
    public int getID() {
        return 45;
    }

}
public class multithred{
    public static void main(String[] args){
        mythr t = new mythr("sapna");
        t.start();
        System.out.println("the id of the thread t is"+t.getID());

    }
}