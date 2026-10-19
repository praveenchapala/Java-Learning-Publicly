public class interfaceanonymous{
    public static void main(String args[]){
        child ch = new child();
        ch.add();
        ch.subtract();
        
        
    }
}

interface calculator{
    void add();
    void subtract();
    
}

class child implements calculator{
    public void add(){
        System.out.println("Adding two numbers");
    }
    public void subtract(){
        System.out.println("Subtracting two numbers");
    }
}