public class functionalinterface3rdapproach{
    public static void main(String args[]){
        calculator calc = ()->{ //lambda expression is used to implement the abstract method of functional interface
                int a = 10; // here in functional interface there is only one abstract method so we dont need to give the name of the method rather we can give just ()-> then we can complete the method implementation
                int b= 20;
                System.out.println("The addition of a and b is :"+(a+b));
            };
            //calculator calc = ()->System.out.println("The addition of a and b is :"+(10+20)); // this is the short form of the above code
            //whenever we have only one statement in the method implementation we can write it in a single line without using {} and return keyword
        calc.add();
        
    }
}
interface calculator{
    void add();
}