public class localinnerclass {
    public static void main(String args[]){
        outer otr = new outer();
        otr.outermethod();
        
    }
}

class outer{
    void outermethod(){
        System.out.println("Inside outer method");
        class inner{
            void innermethod(){
                System.out.println("Inside inner method");
            }
        }
        inner inr = new inner();
        inr.innermethod();
    }
}