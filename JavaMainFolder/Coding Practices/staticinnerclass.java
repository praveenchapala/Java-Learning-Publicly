public class staticinnerclass {
    public static void main(String args[]){
        outer.inner.displayinner(); // static inner class can be accessed directly by using outer class name and inner class name
        
    }
}

class outer{
    int a =10;
    static int b=30;
    void displayouter(){
        System.out.println("Inside Outer class");
    }

    static class inner{
        int c =40;
        static int d = 50;
        static void displayinner(){
            System.out.println("Inside inner class");
            // System.out.println(a);///tmp/6djOImrXQE-lZdddELr/Main.java:20: error: non-static variable a cannot be referenced from a static context
            System.out.println(b);
            // System.out.println(c);/tmp/6djOImrXQE-lZdddELr/Main.java:22: error: non-static variable c cannot be referenced from a static context
            System.out.println(d);
        }
    }
}