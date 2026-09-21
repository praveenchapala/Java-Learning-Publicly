
import java.util.*;
public class reverse{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[]  =new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        for(int i=size-1;i>=0;i--){
            System.out.println(arr[i]+" ");
        }
    }
}
