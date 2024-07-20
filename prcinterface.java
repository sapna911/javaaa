 class monkey{
    void jump(){
        System.out.println("jumping...");
    }
    void bite(){
        System.out.println("biting...");
    }
 }

 interface basicanimal{
     void eat();
     void sleep();
 }

 class human extends monkey implements basicanimal{
    public void sleep(){
        System.out.println("Sleeping...");
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eat'");
    }
 }
 
 
 
 
 
  public class prcinterface {
    public static void main(String[] args){
        human obj= new human();

        obj.bite();

        // question5 m1
        monkey m1 =new human();
        //m1.speak(); can't do
        basicanimal b =new human();
        b.eat();
        b.sleep();
       /// b.speak();can't do
        
    }
    
}
