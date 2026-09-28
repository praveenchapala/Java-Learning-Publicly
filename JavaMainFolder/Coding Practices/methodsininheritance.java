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
    void attendmeeting(){
        System.out.println("Manager is leading meeting");
    }

    //child specific method 
    void conductreview(){
        System.out.println("Manager is conducting performance review");
    }
}