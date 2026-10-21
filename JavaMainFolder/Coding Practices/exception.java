import java.util.*;
public class exception{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Program started");
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
//         int res = num1/num2; //Program started
// Enter the first number
// 12
// Enter the second number
// 0
// ERROR!
// Exception in thread "main" java.lang.ArithmeticException: / by zero
// 	at Main.main(Main.java:10)


        // exception means when something unexpected occurs in our program it leads to interrupt the normal flow of our program so this is only called as exception 
        // for handling exceptions we have different ways 
        //1.try-catch block
        //2.ducking the exception
        //3.rethrowing the exception

        // whenever exception occurs in our program that jvm automatically created one object which is exception object and if object is there automatically class also will be there that class is called exception class 
        // in jvm we have rts(runtime system) so whenever exception occurs exception will be given to rts and this rts will give exception to user defined exception handler or default exception handler 
        //if user is providing any exception handling program then rts wil give exceptions to user defined exception handler if not rts will give exceptions to default exception handler and this default exception handler will abruptly terminates the program and give clear exceptinon messsage in console
        System.out.println("Result: "+res);
        System.out.println("Program completed");
        
    }
}