public class construct {
    public static void main(String args[]){
        Student st = new Student(12,"Praveen","prav@gmail.com",90);
        st.displayinfo();
        
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
    void displayinfo(){
        System.out.println("Student Age: "+age);
        System.out.println("Student name: "+name);
        System.out.println("Student email: "+email);
        System.out.println("Student marks: "+marks);
    }
}