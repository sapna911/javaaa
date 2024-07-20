 class ekclass{
    int a;
    public int getA(){
        return a;
    }
    ekclass(int v){
        a=v;
    }
    public int returnnone(){
        return 1;
    }
}
public class again{
    public static void main(String[] args){
        ekclass e = new ekclass(5);
        System.out.println(e.getA());
    }
}