import java.util.*;
class positivecount{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        int positivecount = 0;
        for(int i=0;i<size;i++){
            if(arr[i]>0){
                positivecount++;
            }
        }
        System.out.println("Positive count: "+positivecount);
    }
}