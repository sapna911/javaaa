public class mathodoverloading {
    //static void telljoke(){
        //System.out.println("im am pgal");
    ///}

    static void foo(){
        System.out.println("good moring bro");
    }

    
    static void foo( int a){
        System.out.println("good moring" + a + "bro");
    }



    

    public static  void main(String[] args){
        //telljoke();
        foo();
        foo(3000);
    }


    
}
