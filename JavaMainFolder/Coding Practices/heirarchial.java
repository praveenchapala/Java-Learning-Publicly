public class heirarchial{
    public static void main(String args[]){
        person2 p2 = new person2();
        p2.humanisperson();
        p2.personrunning();
        p2.persondrinking();
        p2.person2cansing();
        p2.person2canroll();
        
    }
}

class Human{  //super class ,baseclass , parent class
    String name;
    int age;

    void humanisperson(){
        System.out.println("Person is having all the categories of human");
    }

    void personrunning(){
        System.out.println("Person is running");
    }

    void persondrinking(){
        System.out.println("Person is drinking");
    }
}

class person1 extends Human{
    int span;

    void person1cando(){
        System.out.println("person 1 can do all the activities of human can do");
    }
        void person1candance(){
            System.out.println("Person 1 can do dance like how all humans does");
        }
    
}


class person2 extends Human{
    void person2cansing(){
        System.out.println("Person 2 can sing songs like how all humans sing");
    }

    void person2canroll(){
        System.out.println("Person 2 can roll like how normal humans can roll");
    }
}