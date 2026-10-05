import java.util.*;
public class poly{
    public static void main(String args[]){
        circle crl = new circle();
        crl.takeinput();
        crl.caluclatearea();
        crl.displayarea();

        rectangle rct  = new rectangle();
        rct.takeinput();
        rct.caluclatearea();
        rct.displayarea();

        square sqrt = new square();
        sqrt.takeinput();
        sqrt.caluclatearea();
        sqrt.displayarea();
        
        
    }
}

class shape{
    int area;

    void takeinput(){
        System.out.println("Taking user input");
    }
    void caluclatearea(){
        System.out.println("Caluclating area");
    }
    void displayarea(){
        System.out.println(area);
    }
}

class circle extends shape{
    int radius;
    void takeinput(){
        System.out.println("Enter the radius");
        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextInt();
    
    }
    void caluclatearea(){
        area = (int)Math.PI * radius * radius;
    }
    
    
}
class square extends shape{
    int side;
    void takeinput(){
        System.out.println("Enter the side of the square");
        Scanner scanner = new Scanner(System.in);
        side = scanner.nextInt();
    }

    void caluclatearea(){
        area = side*side;
    }
}

class rectangle extends shape{
    int length;
    int breadth;
    void takeinput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the reactangle");
        length =scanner.nextInt();
        System.out.println("Enter the breadth of the rectangle");
        breadth = scanner.nextInt();
    }
    void caluclatearea(){
        area = length*breadth;
    }
}