public class approach2interfaceanonymous{
    public static void main(String args[]){
        calculator calc = new calculator(){
            public void add(){
                System.out.println("Adding two numbers");
            }
            public void subtract(){
                System.out.println("Subtracting two numbers");
            }
        };
        calc.add();
        calc.subtract();
        
        
        
    }
}

interface calculator{
    void add();
    void subtract();
    
}
