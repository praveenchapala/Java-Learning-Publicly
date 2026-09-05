import java.util.*;
public class max{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int arr[]= new int[5];
         System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length-1;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("The array elements are:");
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
        int max=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        System.out.println("the max of the elements of an array is:"+max);
    
    }
}