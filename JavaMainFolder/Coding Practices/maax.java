import java.util.*;
public class maax{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[]  =new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max of the array elements are:"+max);
        
    }
}