public class implicitsupercall{

    public static void main(String args[]){
        Dog dg = new Dog(); //creating an instance of a class 
       
    }
}

class Animal{
    public Animal(){
        System.out.println("Animal class is created");
    }
}

class Dog extends Animal{
    public Dog(){   //compiler implicitly inserts super() here 
        System.out.println("Dog class is created");
    }
}