public class addition {
    public static void main(String[] args){
        int a=5;
        int b=9;
        //method calling
        int c=add(a,b); //a and b are actual parameters
        System.out.println("the sum of a and b is="+c);
    }
//user defined method
public static int add(int n1,int n2){
    int s;
    s=n1+n2;
    return s;
} //n1 and n2 are formal parameters
    
    
}
