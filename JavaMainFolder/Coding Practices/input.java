import java.util.*;
public class input{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you name:");
        String fullname=sc.nextLine();
        System.out.println("Full Name is :"+fullname);
        System.out.println("Enter your age:");
        int age =sc.nextInt();
        System.out.println("The age is :"+age);
        System.out.println("Enter your height:");
        double height=sc.nextDouble();
        System.out.println("Your height is:"+height);
        sc.close();
        
    }
}