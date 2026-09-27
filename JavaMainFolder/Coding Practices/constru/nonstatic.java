// non static block 
// and also contructor are both called
//  when the object is created so in this
//  program we will check which either 
// non static block gets called and executed
//  first or else contructor is being called and executed first

class nonstatic{
    public static void main(String args[]){
        Student st = new Student();
        
    }
}

class Student{
    int age;
    String name;
    
    Student(){
        System.out.println("Constructor is being getting executed");
    }
    
    {
        System.out.println("Non static block getting executed");
    }
    
}


//output is : Non static block is getting executed
//Constructor is being getting executed.
//by this you can clearly able to understand that non static block gets ececuted first whenever the object is created beacuse object creation is a call to constuctor as well as non static block so we checked with this program