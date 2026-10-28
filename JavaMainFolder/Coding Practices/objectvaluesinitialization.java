public class objectvaluesinitialization {
    public static void main(String args[]){
        vehicle vh = new vehicle(12,"Suzuki",45.9);
        vh.getdetails();
        
    }
}

class vehicle{
    int vehicleid;
    String vehiclename;
    double milage;

    vehicle(int v,String vh,double mi){
        vehicleid=v;
        vehiclename = vh;
        milage = mi;
        
    }

    public void getdetails(){
        System.out.println("Vehicle id is:"+vehicleid);
        System.out.println("Vehicle name is:"+vehiclename);
        System.out.println("Vehicle milage is:"+milage);
    }
}

