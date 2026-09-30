import java.util.*;

public class secmin{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }

        long firstmin = Long.MAX_VALUE;
        long secmin =Long.MAX_VALUE;
         for(int i=0;i<size;i++){
             if(arr[i] < firstmin){
                 secmin = firstmin;
                 firstmin = arr[i];
             } else if(arr[i] > firstmin && arr[i] <secmin){
                 secmin = arr[i];
             }
         }

        if(secmin == Long.MAX_VALUE){
            System.out.println("No second smallest distinct value:");
        }else{
            System.out.println(secmin);
        }
        
    }
}