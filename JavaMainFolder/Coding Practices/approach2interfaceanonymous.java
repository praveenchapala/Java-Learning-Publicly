public class approach2interfaceanonymous{
    public static void main(String args[]){
        calculator calc = new calculator(){
            public void add(){
                int a =20;
                int b= 30;
                System.out.println("Adding two numbers: " + (a + b));
            }
            public void subtract(){
                int a =20;
                int b= 30;
                System.out.println("Subtracting two numbers: " + (a - b));
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
