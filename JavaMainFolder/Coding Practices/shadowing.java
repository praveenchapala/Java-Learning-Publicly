public class shadowing{
    public static void main(String args[]){
        
    }
}
class Student{
    int age;
    int roll;
    String name;
    int marks;

    Student(int age,int roll,String name,int marks){
        //whenever we are using this keyword it means it holds the adress of current object(instance)
        //we use this keyword to avoid the shadowing problem whenever the name clash happpens in between the instance varaibles and local varaibles there occurs shadowing problem so to avoid it we use this keyword.
        this.age = age;
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    void displayinfo(){
        System.out.println("Student age:"+age);
        System.out.println("Student roll:"+roll);
        System.out.println("Student name:"+name);
        System.out.println("Student marks:"+marks);
        
    }
}