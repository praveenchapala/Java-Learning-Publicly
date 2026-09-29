public class visibilityofacessmodifiers {
    public static void main(String args[]){
        child c = new child();
        c.method();

    } 
}





class Parent{
    void method(){
        System.out.println("Parent class Method");
    }
}

class child extends Parent{
    void method(){
        System.out.println("child class overriding method");
    }
}

//we can increase the visibility of the acess modifier of the method while overriding from parent class to child class but we cannot decrease the visibility of the acess modifier of the method while overriding from parent class to child class

//we can use same acess modifier of the method while overriding from parent class to child class




//sequence is 1.public 2.protected 3.default 4.private


