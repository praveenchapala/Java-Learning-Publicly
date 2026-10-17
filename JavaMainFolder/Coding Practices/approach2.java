public class approach2{
    public static void main(String args[]){
        outer otr = new outer(){ //here we are creating the object of inner class which dont have name means anonymous class and storing it in outer class reference so we have upcasting here // here we are creating object of child class which we have to provide the implementation of the abstract method to make it concrete methods
            void method1(){
                System.out.println("Inside method1 ");
            }
            void method2(){
                System.out.println("Inside method2");
            }
        };
        otr.method1();
        otr.method2();
        
    }
}

abstract class outer{
    abstract void method1();
    abstract void method2();
    
}
//here it is the second approch of anonymous inner class
//abstract classes objjects we cannot create and also interface objects cannot be created or instantiated

