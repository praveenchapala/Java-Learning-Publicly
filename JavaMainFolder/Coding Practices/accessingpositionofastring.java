import java.util.Scanner;

public class accessingpositionofastring {
     public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the full name:");
         char ch=sc.next().charAt(2);
         System.out.println("the character at the 2nd position is :"+ch);
         sc.close();
    }

}
