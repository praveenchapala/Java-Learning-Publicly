public class upcastingdrawback{
    public static void main(String args[]){
        Parent p = new Parent();
        p.displayparent();
        p.display();
        // to achieve upcasting we will store the object in the parent class reference now 
        Parent c1 = new child1();
        c1.displayparent();
        c1.display();
        c1.child1display();


//         ERROR!
// /tmp/miKqISYfov-cWrUnrq8/Main.java:10: error: cannot find symbol
//         c1.child1display();
//           ^
//   symbol:   method child1display()
//   location: variable c1 of type Parent
// ERROR!
// /tmp/miKqISYfov-cWrUnrq8/Main.java:15: error: cannot find symbol
//         c2.child2display();
//           ^
//   symbol:   method child2display()
//   location: variable c2 of type Parent
// 2 errors
// ERROR!
// error: compilation failed


        // here conclusion is that parent class cannot acess the child specific methods and it can acess the inheritted method and overridden method but it cannot acess the child specific method as the error is clearly telling 

        // this is the drawback or limitation of upcasting 

        // if there is any requirement saying that we have to acess all the methods which are child-specific method , inherited method and overridden method then we use the concept of downcasting to access the child specific methods

        Parent c2 = new child2();
        c2.displayparent();
        c2.display();
        c2.child2display();
        
    }
}

class Parent{
    void displayparent(){
        System.out.println("Inside parent display");
    }
    void display(){
        System.out.println("inside parent method");
    }
}

class child1 extends Parent{
    void display(){
        System.out.println("inside child1 method");
    }
    void child1display(){
        System.out.println("inside child1 display method");
    }
}

class child2 extends Parent{
    void display(){
        System.out.println("Inside child2 method");
    }
    void child2display(){
        System.out.println("Inside child2 display method");
    }
}