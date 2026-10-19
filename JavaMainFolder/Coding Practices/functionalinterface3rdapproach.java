public class functionalinterface3rdapproach{
    public static void main(String args[]){
        calculator calc = ()->{
                int a = 10; // here in functional interface there is only one abstract method so we dont need to give the name of the method rather we can give just ()-> then we can complete the method implementation
                int b= 20;
                System.out.println("The addition of a and b is :"+(a+b));
            };
        calc.add();
        
    }
}
interface calculator{
    void add();
}