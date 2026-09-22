import java.util.*;
public class evencount{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[]  =new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        int evencount=0;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                evencount++;
            }
        }
        System.out.println(evencount);
        
    }
}