public class constructorchaining{
    public static void main(String args[]){
        child ch = new child(); //call to constructor so in child class user doesnt provided any constructor so java automatically attaches one constructor default constructor. now in child class one default constructor is provided by java and the first statement is super()
// which actually helps to call the parent class constructor of current class so this process is known as constuctor chaning 
       ch.displaychild();
        ch.displayparent();
    }
}
// class object{
//}

class Parent //extends object class here in java if any class must be having object class by default in java


    // Parent(){
    // super();
    // }
    {

    void displayparent(){
        System.out.println("Inside parent class");
    }
}

class child extends Parent{
    // child(){
    //     super();
    // }
    
    void displaychild(){
        System.out.println("Inside child class");
    }
}