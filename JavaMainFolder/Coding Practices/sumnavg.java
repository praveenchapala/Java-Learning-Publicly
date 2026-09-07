import java.util.*;
public class sumnavg {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] =scanner.nextInt();
        }

        int sum=0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        System.out.println(sum/size);
    }
    
}
