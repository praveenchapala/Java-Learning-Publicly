import java.util.*;
public class abstraction{
        public static void main(String args[]){
                reactangle rct  = new reactangle();
                rct.takeinput();
                rct.calculatearea();
                rct.displayarea();

                circle crl = new circle();
                crl.takeinput();
                crl.calculatearea();
                crl.displayarea();

                square s = new square();
                s.takeinput();
                s.calculatearea();
                s.displayarea();
                
        }
}

// abstract classes are such classes which are incomplete and we cannot instanitaite the object creation of abstract class
// abstract classes are used to acheive abstraction in java
// abstraction is the process of hiding the implementation details and showing only functionality to the user
//abstract class can be used as base class for other classes to extend and implement the abstract methods.
abstract class shape{
        int area;
// abstract is the incomplete 
        abstract void takeinput(); // here these methods implementation is not used by any of the child classes so body of this method is not required so we remove it and we write abstract 
        // in java we have one rule every method should have body so now we make it abstract so abstract methods dont have body and if one method inside the class is abstract then class also should be abstract 
        // the methods which dont have body then we call it as abstract methods.
        // if any method doesnt have body then that method must be declared as abstract
                
        abstract void calculatearea(); // here also this method implementation is not used by any of the child clases
        void displayarea(){
                System.out.println(area);
        }
}

// there is no such rule that abstract class consists if abstract methods also we can have non abstract methods as well.

// if a class consist of abstract methods then that class must be declared as abstract 

class reactangle extends shape{
        int length;
        int breadth;
        void takeinput(){
                Scanner scanner = new Scanner(System.in);
                length = scanner.nextInt();
                breadth = scanner.nextInt();
                
        }
        void calculatearea(){
                area = length*breadth;
        }

        void displayarea(){
                System.out.println(area);
        }
}

class circle extends shape{
        int radius;

        void takeinput(){
                Scanner scanner = new Scanner(System.in);
                radius = scanner.nextInt();
                
        }
        void calculatearea(){
                area = (int)Math.PI * radius *radius;
        }
        void displayarea(){
                System.out.println(area);
        }
}

class square extends shape{
        int side;
        void takeinput(){
                Scanner scanner = new Scanner(System.in);
                side = scanner.nextInt();
        }
        void calculatearea(){
                area = side*side;
        }
        void displayarea(){
                System.out.println(area);
        }
}