import java.util.Scanner;

public class Takinginput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the byte value:");
        byte a=sc.nextByte();
        System.out.println("The byte value is :"+a);
        System.out.println("Enter the Short value");
        short b=sc.nextShort();
        System.out.println("The Short value is :"+b);
        System.out.println("Enter the Integer value: ");
        int c=sc.nextInt();
        System.out.println("The integer value is :"+c);
        System.out.println("Enter the long value:");
        long d= sc.nextLong();
        System.out.println("The Long value is :"+d);
        System.out.println("enter the float value:");
        float e= sc.nextFloat();
        System.out.println("The float value is:"+e);
        System.out.println("Enter the double value:");
        double f= sc.nextDouble();
        System.out.println("The double value is:"+f);
        System.out.println("Enter the boolean value:");
        boolean g= sc.nextBoolean();
        System.out.println("The boolean value is:"+g);
    }
}
