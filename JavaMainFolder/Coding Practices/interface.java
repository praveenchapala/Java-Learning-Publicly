public class interface{
    public static void main(String args[]){
        child ch = new child();
        ch.method1();
        ch.method2();
        
    }
}

public interface parent1{
    void method1();
}
public interface parent2{
    void method2();
}
public class child implements parent1,parent2{
    public void method1(){
        System.out.println("Inside child method1");
    }
    public void method2(){
        System.out.println("Inside child method2");
    }
}