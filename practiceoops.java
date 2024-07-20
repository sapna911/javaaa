class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

}

class cellphone{
    public void vibrating(){
        System.out.println("VIBRATING....");
    }

    public void ringing(){
        System.out.println("RINGING....");
    }
}


class square{
    int side;
    int a;
    public int area(){
        return side*side;
    }
    public int perimeter(){
         
        return 4*a;
    }
} 
class flower{
    public void color(){
        System.out.println("GREEN");

    
    }
}
 

public class practiceoops {
    public static void main(String[] args){
        /*
        //probllllllllem 1
        Employee1 harryy = new Employee1();
        harryy.setName("code with me");
        harryy.salary=233;
        System.out.println(harryy.getName());
        System.out.println(harryy.getSalary());

        //probllllllllllllllllllllem 2
        cellphone mi = new cellphone();
        mi.ringing();
        mi.vibrating();

        */

        //problme 3
        square sq = new square();
        sq.side=16;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());


        flower rose = new flower();
        rose.color();
       



    }
    
}

