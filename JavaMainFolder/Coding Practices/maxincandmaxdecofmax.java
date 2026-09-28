import java.util.*;
public class maxincandmaxdecofmax{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int size  = scanner.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }

        int inclen=1;
        int maxinc=1;
        int declen=1;
        int maxdec=1;
        for(int i=1;i<size;i++){
            if(arr[i]>arr[i-1]){
                inclen++;
            }else{
                inclen=1;
            }
        }
        maxinc = Math.max(inclen,maxinc);
        for(int i=1;i<size;i++){
            if(arr[i]<arr[i-1]){
                declen++;
            }else{
                declen=1;
            }
        }
        maxdec = Math.max(declen,maxdec);

        int result = Math.max(maxinc,maxdec);
        System.out.println("The maximum of maxiumum increasing and maximum decreasing is:"+result);
    }
}