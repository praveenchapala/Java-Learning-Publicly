//final 

//final - variable (use to create constants) values cant be change
// final - methods (final methods can be inherited but we cannot override means that we can inherit method as it is but we can change its body or we cannot change its implementation)

// final - class (final classes cannot be inherited)


public class finalmethod{
    public static void main(String args[]){
        Uday ud = new Uday();
        ud.eat();
        
        
    }
}

class Praveen{
    final void eat(){
        System.out.println("Praveen is eating food");
    }
}

class Uday extends Praveen{
    void eat(){
        System.out.println("Uday is extending the Praveen parent class");
    }
    
}

// ERROR!
// /tmp/4eBoGgS1Zv/Main.java:25: error: eat() in Uday cannot override eat() in Praveen
//     void eat(){
//          ^
//   overridden method is final
// 1 error
// ERROR!
// error: compilation failed

// interviewer may ask that how to stop method overriding in java then we can use final keyword with method to stop method overriding