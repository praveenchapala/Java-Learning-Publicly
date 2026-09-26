public class constructoverloading{
    public static void main(String args[]){
        Student st = new Student(12,"Praveen","prav@gmail.com",90);
        st.displayinfo();
        Student st2 = new Student(13,"Ravi");
        st2.displayinfo();
        Student st3 = new Student(14,"Mahi","Mahi@gmail.com");
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
    Student(int a,String b,String c){
        age =a;
        name = b;
        email =c;
    }
    void displayinfo(){
        System.out.println("Student Age: "+age);
        System.out.println("Student name: "+name);
        System.out.println("Student email: "+email);
        System.out.println("Student marks: "+marks);
    }
}