import java.util.*;
class searching{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        int target=scanner.nextInt();
        boolean found = false;
        for(int i=0;i<size;i++){
            if(arr[i] == target){
                
                System.out.println("The element found at the index:"+i);
                found=true;
                break;
            
            }
        }
        if(!found){
            System.out.println("The element is no found at any position");
        }
  
        
    }
}