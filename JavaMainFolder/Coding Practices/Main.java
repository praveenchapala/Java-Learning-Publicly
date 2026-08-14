class Main{
    public static void main(String args[]){
        Student s1=new Student();
        s1.age=20;
        s1.name="Praveen";
        s1.id=201;
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.id);
        s1.run();
        s1.sleep();
    }
}

class Student{
    int age;
    String name;
    int id;
    void run(){
        System.out.println("Employee is Running");
    }
    void sleep(){
        System.out.println("Employee is Sleeping");
    }
}
