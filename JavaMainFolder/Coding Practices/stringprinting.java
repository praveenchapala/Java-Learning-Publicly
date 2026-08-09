import java.util.Scanner;

public class stringprinting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter your age:");
        int age =sc.nextInt();
        System.out.println("The age is :"+age);
        sc.nextLine();
        System.out.println("Enter you name:");
        String fullname=sc.nextLine();
        System.out.println("Full Name is :"+fullname);
        System.out.println("Enter your height:");
        double height=sc.nextDouble();
        System.out.println("Your height is:"+height);
        sc.close();
    }
    
}

//here we are adding sc.nextLine() after taking integer input beacause when we take integer input and press enter, the enter key is also considered as input and it will be stored in the buffer. So when we take string input after that, it will take that enter key as input and it will not wait for user to enter the string. So to avoid this we are adding sc.nextLine() after taking integer input.
