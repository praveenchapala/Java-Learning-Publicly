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

// this is really a problem for us to create objects and seeing what is there inside the object these proces is very headache for us 
//so to solve this problem we have spring framework which is a dependency injection framework which will take care of creating the objects and injecting the objects inside the object so that we can use it easily without worrying about creating the objects and injecting them inside the object

//what is framework -- framework is a ready made solution for us we just have to use it to solve the problem