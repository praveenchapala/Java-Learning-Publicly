public class NestingLoops{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*"+" ");
                
            }
            System.out.println();
        }
        
    }
}

// --Time complexity--- 
// Outer loop runs m times and inner loop runs n times then time complexity will be mxn 
// if both loops runs n times then time complexity will be  O(n^2)
