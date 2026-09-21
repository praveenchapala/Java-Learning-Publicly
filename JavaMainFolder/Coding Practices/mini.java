import java.util.*;
public class mini{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[]  =new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Min of the array elements are:"+min);
        
    }
}