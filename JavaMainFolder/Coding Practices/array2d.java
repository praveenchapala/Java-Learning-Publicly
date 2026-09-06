import java.util.*;
public class array2d{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int arr[][]=new int[3][5];
        for(int i=0;i<=2;i++){
            for(int j=0;j<=4;j++){
                arr[i][j]=scanner.nextInt();
            }
        }

        for(int i=0;i<=2;i++){
            for(int j=0;j<=4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}