import java.util.*;
public class arrayoutofbounds{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        try{
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[4]+" ");
        }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please enter the value that is inboundary of array size");
        }
        System.out.println("Program continues execution this is the last line of the program so if it reaches this line then the exception is handled gracefully");
    }
}