import java.util.*;
class negcount{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        int negcount = 0;
        for(int i=0;i<size;i++){
            if(arr[i]<0){
                negcount++;
            }
        }
        System.out.println("Negative count: "+negcount);
    }
}