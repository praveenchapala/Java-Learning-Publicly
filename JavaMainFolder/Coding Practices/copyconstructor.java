public class copyconstructor{
    public static void main(String args[]){
        // Library l1 = new Library(12,"poordad",120);
        // Library l2 = new Library(12,"poordad",120);
        // Library l3 = new Library(13,"poordad",120);
        //here all the objects trying to have the same data so instead of writing all the parameters for every object creation we will go for one approach "Copy constructor"
        Library l1 = new Library(12,"Poordad",200); // call to constructor here we are passing only 3 parameters but what if there will be 100 parameters yes right may be the chances will be there so this is the problem so we have copy contructors.
        l1.displaybooksinfo();
        Library l2 = new Library(l1);
        l2.displaybooksinfo();
        Library l3 = new Library(l1);
        l3.displaybooksinfo();
        
        
        
    }
}

class Library{
    int pages;
    String name;
    int price;

    //Standard constructor 
    
    Library(int pages,String name,int price){
        this.pages= pages;
        this.name = name;
        this.price = price;
    }

    //copy constructor
    Library(Library lt){
        pages=lt.pages;
        name=lt.name;
        price=lt.price;
    }

    void displaybooksinfo(){
        System.out.println("Book pages :"+pages);
        System.out.println("Book name: "+name);
        System.out.println("Book price: "+price);
    }

    
    
}