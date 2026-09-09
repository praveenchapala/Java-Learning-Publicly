import java.util.*;

public class secondlargest{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
         for(int i=0;i<size;i++){
             if(arr[i] > largest){
                 secondlargest=largest;
                 largest=arr[i];
             }else if(arr[i]>secondlargest && arr[i]!=largest){
                 secondlargest=arr[i];
             }
         }
        System.out.println(secondlargest);
    }
}





        
