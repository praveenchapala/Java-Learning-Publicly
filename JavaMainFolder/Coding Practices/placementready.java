public class placementready {
    public static void main(String args[]){
        int marks = 68;
        int attendance = 80;
        int practicedays= 3;
        String status=(marks>60 && attendance>75) ? "Placement Ready" : "Continue Preparation";
        System.out.println(status);
        for( int i=1;i<=3;i++){
            System.out.println("Practice Day: "+i);
        }
            

        
    }

}
