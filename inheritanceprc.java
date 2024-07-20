class Circle{
    public int radius;
    Circle(int r){
        System.out.println("i amcirclec");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r,int n){ 
        super(r) ;
        //int h;
        this.height=height;///CONTRUCTOR

    }

   // public int height;
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}



public class inheritanceprc {
    public static void main(String[] args){
    // PROBLEM 1
    //Circle obj= new Circle(0);
    Cylinder1 obj=new Cylinder1( 12,4);

    }

    
}
