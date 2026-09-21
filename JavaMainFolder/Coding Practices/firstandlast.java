import java.util.*;
public class firstandlast{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[]  =new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        System.out.println("First Element"+"="+arr[0]);
        System.out.println("Last Element"+"="+arr[arr.length-1]);
    }
}