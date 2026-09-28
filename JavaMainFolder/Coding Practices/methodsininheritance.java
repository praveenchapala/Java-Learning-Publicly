public class methodsininheritance{
    public static void main(String args[]){
        Manager mg = new Manager();
        mg.work();
        mg.attendmeeting();
        mg.conductreview();
        
    }
}
class employee{
    void work(){
        System.out.println("Employee is working ");
    }
    void attendmeeting(){
        System.out.println("Employee is attending meeting");
    }
}

class Manager extends employee{
    //overridden method
    @Override  // this annotation is used to indicate that the method is overridden from the parent class
    void attendmeeting(){
        System.out.println("Manager is leading meeting");
    }

    //child specific method 
    void conductreview(){
        System.out.println("Manager is conducting performance review");
    }
}