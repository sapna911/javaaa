class Employee{
    int id;
    
    String name;
    public void printdetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
}


public class oops1 {
    public static void main(String[] args){
        System.out.println("THIS IS OUR CUSTOM CLASS");
        Employee harry=new Employee();//INSTANTIATING A NEW EMPLOYEE OBJECT
        //SETTING PROPERTIES
        harry.id=12;
        harry.name="code with harry";
        //pritnting the attributes
        harry.printdetails();
        //System.out.println(harry.id);
        //System.out.println(harry.name);
    }
    
}
