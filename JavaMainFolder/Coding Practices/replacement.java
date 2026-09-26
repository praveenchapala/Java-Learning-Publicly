import java.util.*;

public class replacement{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        int replacement = scanner.nextInt();
        int count=0;
        for(int i=0;i<size;i++){
            if(arr[i]==target){
                arr[i] = replacement;
                count++;
                
            }
        }
        System.out.println("Changes:"+count);
        System.out.print("Array changes:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}