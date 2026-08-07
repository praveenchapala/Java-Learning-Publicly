public class Loops{
    public static void main(String args[]){
        int total=0;
        for(int i=1;i<=5;i++){
            if(i==3) continue;
            System.out.println("Number:"+i);
            total+=i;
            
            
        }
        System.out.println("Total: "+total);
        
    }
}