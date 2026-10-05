public class downcasting {
    public static void main(String args[]){
        developer d; // upcasting means storing child object in parent class reference 
        d=new javadeveloper(); 
        d.attendmeeting(); //inherited method
        d.doproject();// overridden method calling
        ((javadeveloper)d).learnjava();  // downcasting hapens here it means we are converting parent reference to child to call child specific methods
        d=new pythondeveloper();
        d.attendmeeting();
        d.doproject();
        ((pythondeveloper)d).learnpython(); //downcasting hapens here it means we are converting parent reference to child to call child specific methods 
        
    }
}

class developer{
    void attendmeeting(){
        System.out.println("developer is attending meeting");
    }

    void doproject(){
        System.out.println("Developer is doing project");
    }
}

class javadeveloper extends developer{
    void doproject(){
        System.out.println("java developer is doing java project");
    }

    void learnjava(){
        System.out.println("Java developer is learning java");
    }
}

class pythondeveloper extends developer{
    void doproject(){
        System.out.println("python developer is doing python project");
    }

    void learnpython(){
        System.out.println("Python developer is learning python");
    }
}