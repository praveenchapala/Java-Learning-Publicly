public class Main{
    public static void main(String args[]){
        book mybook = new book();
        mybook.mychapter.title = "poordad rich son";
        mybook.mychapter.content = "it is having morality of real life";
        System.out.println(mybook.mychapter.title);
        System.out.println(mybook.mychapter.content);
        
        
    }
}

class book{
    chapter mychapter = new chapter();
}
class chapter{
    String title;
    String content;
}

//this is the  example of composition has a relationship so it is a strong has-a relationship beacuse whenever the outside object is deleteed then composite object also deleted 

//here chapter object cannot be accessible independently 

//chapter exists only till the book object exists

// the main difference between the aggregate and composite is :
//aggregate -- objects were created outside only reference stored inside the object.

//composition -- entire object present inside the object

// aggregate objects can exist independently and composite objects are cannot exist independently