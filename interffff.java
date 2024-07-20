interface Bicycle{
    int a=45;
    void applybrake(int decrement);
    void speedup(int increment);
}
class AvonCycle implements Bicycle{///interface can not exatend to another interface (two interface only implements to each other but class can implement  and extends to the interface )
    public char[] a;
    void blowHorn(){
        System.out.println("pee pee pooo pooo");
    }
    public void applybrake(int decrement){
        System.out.println("apply breake");
    }
    public void speedup(int increment){
        System.out.println("apply speedup");
    }
    /* 
    @Override
    public int a() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'a'");
    }*/
}
public class interffff{
    public static void main(String[] args){
        AvonCycle cycleharry = new AvonCycle();
        cycleharry.applybrake(1);
        System.out.println(cycleharry.a);
    }
}