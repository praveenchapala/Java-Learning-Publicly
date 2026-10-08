public class methodhiding {
    public  static void main(String args[]){
        Parent p = new Parent();
        p.method1(); //Inside parent method 1  method1 is of non static type so it belongs to object methods so here object is Parent so we will get the parent object methods 
        p.method2(); //Inside Parent method 2 method 2 is of static type so belongs to class so here class reference is of parent type so we ill get parent class methods.
        Child c = new Child(); 
        c.method1();//inside child method 1  method 1 is of non static type so it belongs to objects so here object is child class then we will get the methods of child object
        c.method2(); //Inside child method 2  method 2 is of static type so it belongs to class so here class is of type child class then we will get the methods of child class 
        Parent ref = new Child();
        ref.method1();  // inside child method1 here method 1 is of non static type so belongs to object then we will get the child object methods 
        ref.method2();  // inside parent method 2  here method 2 is of static then so belongs to class so here class is of parent type then we will get methods of class 
        
    }
}

class Parent{
    void method1(){  // if it non static method is getting overridden to the child class then we call it as method overriding 
        System.out.println("Inside parent method 1");
    }
    static void method2(){  // if the static method getting overridden to the child class then we call it as "Method Hiding"
        System.out.println("Inside Parent method 2");
    }
}

class Child extends Parent{
    void method1(){// if it non static method is getting overridden to the child class then we call it as method overriding 
        System.out.println("inside child method 1");
    }

    static void method2(){ // if the static method getting overridden to the child class then we call it as "Method Hiding"
        System.out.println("Inside child method 2");
    }
}