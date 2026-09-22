public class constructor{
    public static void main(String args[]){
        Student st = new Student(12,"Praveen",123,"Swati");
        st.displayinfo();
        
    }
}

class Student{
    int age;
    String name;
    int roll;
    String parentname;


    Student(int a,String n,int r,String p){
        age=a;
        name=n;
        roll=r;
        parentname=p;
    }

    void displayinfo(){
        System.out.println("Age: "+age);
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Parentname: "+parentname);
    }
}