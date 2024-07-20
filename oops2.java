class myEmployee{
    private int id;
    private String name;


    public String getName(){
        return name;
    }


    public void setName(String n){
        name = n;
    }

    public void setId(int i){
        id = i;

    }

    public int getId(){
        return id;
    }
}







public class oops2 {
    public static void main(String[] args){
        myEmployee harry = new myEmployee();
        harry.setName("code with harry");
        System.out.println(harry.getName());
        
    }
    
}
