public class swapwithoutextravaraible{
    public static void main(String args[]){
        int a=20;
        int b=30;
        System.out.println("Before swapping:");
        System.out.println("A:"+a);
        System.out.println("B:"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping:");
        System.out.println("A:"+a);
        System.out.println("B:"+b);
    }
}