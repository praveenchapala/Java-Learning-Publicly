import java.util.*;
public class Main1{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        long sum=0;
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
            sum+=arr[i];
            
        }
    double average= (double)sum/size;
        int count=0;
        for(int i=0;i<size;i++){
            if(arr[i]>average){
                count++;
            }
        }
        System.out.println(count);
    }
}