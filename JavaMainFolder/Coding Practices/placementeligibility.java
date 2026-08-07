public class placementeligibility {
    public static void main(String args[]){
        int marks=72;
        int attendance=80;
        boolean projectcompleted=true;
        boolean markseligible= marks>=60;
        boolean attendanceeligible=attendance>=75;
        boolean academiceligible= markseligible&&attendanceeligible;
        boolean placementeligible=academiceligible&&projectcompleted;
        System.out.println("PlacementEligible: "+placementeligible);
    }

}
