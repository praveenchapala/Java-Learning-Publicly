public class lambda{
    public static void main(String args[]){
        addition ad = (a,b)->{
            System.out.println("The addition of two numbers are:"+(a+b));
            
        };
        ad.add(10,20);
       
        
    }
}
interface addition{
    void add(int a,int b);
}