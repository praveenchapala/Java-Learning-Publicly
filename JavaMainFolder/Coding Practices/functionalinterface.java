public class functionalinterface{
    public static void main(String args[]){
        child ch = new child();
        ch.add();
        
    }
}
    interface calculator{
    void add();//functional interface is the interface with only one abstract method
    }
class child implements calculator{
    public void add(){
        int a=10;
        int b=20;
        System.out.println("the addition is:"+(a+b));
    }
}