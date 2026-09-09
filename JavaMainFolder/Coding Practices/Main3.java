

public class Main3{
    public static void main(String args[]){
        Student st = new Student();
        st.id=101;
        st.name ="ravi";
        st.height = 5.6;
        st.Sleep();
        st.run();
        System.out.println(st.id);
        System.out.println(st.name);
        System.out.println(st.height);
        
    }
}
class Student{
    int id;
    String name;
    double height;
    void Sleep(){
        System.out.println("Student is sleeping");
    }
    void run(){
        System.out.println("Student is running");
    }
    
}