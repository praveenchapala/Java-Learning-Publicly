//final 

//final - variable (use to create constants) values cant be change
// final - methods (final methods can be inherited but we cannot override means that we can inherit method as it is but we can change its body or we cannot change its implementation)

// final - class (final classes cannot be inherited)


public class finalclass{
    public static void main(String args[]){
        Uday ud = new Uday();
        ud.eat();
        
        
    }
}

final class Praveen{
     void eat(){
        System.out.println("Praveen is eating food");
    }
}

class Uday extends Praveen{
    void eat(){
        System.out.println("Uday is extending the Praveen parent class");
    }
    
}

// ERROR!
// /tmp/ZQPuCCUOy8/Main.java:24: error: cannot inherit from final Praveen
// class Uday extends Praveen{
//                    ^
// 1 error
// ERROR!
// error: compilation failed


// interviewer may ask that how to stop inheritance in java then we can use final keyword with class to stop inheritance


