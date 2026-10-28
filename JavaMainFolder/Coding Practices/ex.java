import java.util.*;
public class ex{
    public static void main(String args[]){
        divide();
        
    }


   static void divide(){
    Scanner sc= new Scanner(System.in);
    int numerator = sc.nextInt();
    int denominator = sc.nextInt();
    int res=numerator/denominator;
    System.out.println(res);
}
}

// //12
// 0
// ERROR!
// Exception in thread "main" java.lang.ArithmeticException: / by zero
// 	at Main.divide(Main.java:13)
// 	at Main.main(Main.java:4)
