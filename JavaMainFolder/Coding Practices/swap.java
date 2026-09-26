//swapping of two numbers using the third temporary variable
public class swap{
    public static void main(String args[]){
        int a=20;
        int b=30;
        System.out.println("A:"+a);
        System.out.println("B:"+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("A:"+a);
        System.out.println("B:"+b);
    }
}