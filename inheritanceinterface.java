interface sampleinterface{
    void meth1();
    void meth2();
}
interface childsampleinterface extends sampleinterface{
    void meth3();
    void meth4();
}
class mysampleClass implements childsampleinterface{
    public void meth1(){
        System.out.println("meth1");
    }

    @Override
    public void meth2() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'meth2'");
    }

    @Override
    public void meth3() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'meth3'");
    }

    @Override
    public void meth4() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'meth4'");
    }
}




public class inheritanceinterface {
    public static void main(String[] args){
        mysampleClass obj = new mysampleClass();
        obj.meth1();

    }
    
}
