import java.util.*;
public class excep{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        try{
        int divres = a/b;
        System.out.println(divres);
        }catch(ArithmeticException e){
            System.out.println("Please enter the value above zero");
            
        }
        
    }
}