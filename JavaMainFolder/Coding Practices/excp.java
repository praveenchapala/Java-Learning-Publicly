import java.util.*;
public class excp{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Program started");
        try{
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        int res = num1/num2;
        System.out.println("Result: "+res);
        }
        catch(Exception e){
            System.out.println("Exception is handled so dont enter the denominator as zero");
        }
        System.out.println("Program completed");
    }
}