class Base1{
    Base1(int a){
        System.out.println("i am a constructor:"+a);
    }

    int x;
    public int getx(){
        return x;
    }
    public void setx(int x){
        this.x=x;
    }
    public void printMe(){
        System.out.println("I ama constructor");
    }
}


class Derived1 extends Base1{
   Derived1(int a) {
        super(a);
        //TODO Auto-generated constructor stub
    }
    /*  Derived1(){
        System.out.println("I AM A DERIVED CLASS");
    }*/
    int y;
    public int getx(){
        return y;
    }
    public void set(int y){
        this.y=y;
    }

}
public class inheri{
    public static void main(String[] args){
        //Derived b =new Derived();
        Base1 b =new Base1(0);/// object of base
        b.setx(4);
        System.out.println(b.getx());

    }
}
   