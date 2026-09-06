import java.util.*;
public class found{
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        int arr[]= new int[4];
        System.out.println("Enter the elements of an array:");
        for(int i=0;i<=arr.length-1;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the key element to be search");
        int key = scanner.nextInt();
        boolean found = true;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==key){
                System.out.println("Element found at index:"+i);
                found = false;
                return;
            
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
        
    }
}