import java.util.*;
public class nterface{
    public static void main(String args[]){
        shape sh;
        sh=new circle();
        sh.takeinput();
        sh.caluclatearea();
        sh.displayarea();
        
        
    }
}

interface shape{
    void takeinput();  // by default in java interfaces are public abstract we dont have to tell java it is abstract methods beacause interface is only having abstract methods non abstract methods will not be there and class implements interface not extends
    //whenever we give what to do and we dont have to provide how to do then it is only technically called as interface 
    void caluclatearea();  // these are public abstract methods if you tell or dont tell.
    void displayarea();
}

class circle implements shape{
    int area;
    int radius;
   public  void takeinput(){
       //here we have to tell public or we have to use same modifier or greater than that modifier we dont decrease the visibility of the class so we have to use same or higher visibility 
        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextInt();
        
    }
    public void caluclatearea(){
        area = (int)Math.PI * radius*radius;
    }
    public void displayarea(){
        System.out.println("The circle area is:"+area);
    }
}