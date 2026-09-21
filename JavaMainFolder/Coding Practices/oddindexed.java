import java.util.*;
public class oddindexed{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[]  =new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        for(int i=0;i<size;i++){
            if(i%2!=0){
                System.out.print(arr[i]);
            }
        }
    }
}