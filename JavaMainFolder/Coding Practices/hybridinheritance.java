public class hybridinheritance{
    public static void main(String args[]){
         book3 b3 = new book3();
        b3.setbooks();
        b3.sortbooks();
       
        b3.bookisuseful();
        b3.bookishavingstory();
    
        
        
    }
}

class Library{
    String name;
    int id;

    void setbooks(){
        System.out.println("Librarian is setting books in racks");
    }

        void sortbooks(){
            System.out.println("Librarian is sorting books in racks");
        }
}
 class book1 extends Library{
     String bookauthor;

     void bookhavepages(){
         System.out.println("Books is having pages");
     }

     void bookhavecolor(){
         System.out.println("Books are having color");
     }
 }


class book2 extends Library{
    String bookadress;

    void bookisuseful(){
        System.out.println("Book reading is very helpful");
    }
}

class book3 extends book2{
    int noofpages;
    void bookishavingstory(){
        System.out.println("Books are having story");
    }
    
}







