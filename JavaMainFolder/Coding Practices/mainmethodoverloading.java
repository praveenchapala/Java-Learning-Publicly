public class mainmethodoverloading{
    public static void main(String args[]){
        System.out.println("Executing Main Method");
        main(20);
        main();
//in java main method can be overloaded because java allows us to create multiple methods with same main method signature but accepts different parameters        
    }
    public static void main(int a){
        System.out.println("Inside method1");
    }
    public static void main(){
        System.out.println("Inside method2");
    }
}