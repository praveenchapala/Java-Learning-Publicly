public class constuctoroverloading{
    public static void main(String args[]){
        Student st = new Student(12,"Praveen","prav@gmail.com",90);
        st.displayinfo();
        Student st2 = new Student(13,"Ravi");
        st2.displayinfo();

        //setter method is used for creating the object beacuse when there is a need of creating objects and setting data later whenever we want then go for setter methods otherwise go for constructor whenever there is a need of passing values while creating the object 

        //if we have created object in main method but in class we didnt write any contructor to call by default java givees default constructor 
        //if programmer doesnt specify the constructor java automatically gives zero parameterized constructor other wise nothing will happen 
        Student st3 = new Student();  //call to constructor so we dont have zero parameterized compatable contructor in class so we have created one constructor to call 
        st3.setdata(20,"rajesh","rajesh@gmail.com");
        st3.displayinfo();
        
    }
}

class Student{
    int age;
    String name;
    String email;
    int marks;

    Student(int a,String b,String c,int d){
        age = a;
        name = b;
        email = c;
        marks = d;
    }
    Student(int a,String b){
        age = a;
        name = b;
    }
    void setdata(int a,String b,String c){
        age =a;
        name =b;
        email=c;
    }
    Student(){
        
    }
    void displayinfo(){
        System.out.println("Student Age: "+age);
        System.out.println("Student name: "+name);
        System.out.println("Student email: "+email);
        System.out.println("Student marks: "+marks);
    }
}