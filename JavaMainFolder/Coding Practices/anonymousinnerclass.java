public class anonymousinnerclass {
    public static void main(String args[]){
        child ch = new child();
        ch.display1();
        ch.display2();
        
    }
}

abstract class outer{
    abstract void display1();
    abstract void display2();
    
}
class child extends outer{
    @Override 
    void display1(){
        System.out.println("Inside display 1");
    }
    @Override 
    void display2(){
        System.out.println("Inside display 2");
    }
}

// this is the approach number 1 of creating anonymous inner classes which we create child class which extends the outer class and creating object of it and can call the methods which are voerridden inside the child class 

//but creating seperate class is useless thing so we have another approach
