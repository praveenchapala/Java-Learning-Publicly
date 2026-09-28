import java.util.*;
public class longestincreasing{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }

        int inclen=1;
        for(int i=1;i<size;i++){
            if(arr[i]>=arr[i-1]){
                inclen++;
            }else{
                inclen=1;
            }
        }
        System.out.println(inclen);
    }
}