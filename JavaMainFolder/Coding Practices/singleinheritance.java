public class singleinheritance{
    public static void main(String args[]){
        car c = new car();
        c.startengine();
        c.applybrakes();
        c.carstart();
        
    }
}

class Vehicle  {
    String vehiclename;
    int vehicleid;

    void startengine(){
        System.out.println("Vehicle is having engine");
    }
    void applybrakes(){
        System.out.println("Vehicle can apply brakes");
    }
}

//this is single inheritance 
//one class is inheriting the properties and behaviour of another class which is parent class 
//generally simple parent class to child class inheritance is known as single inheritance

class car extends Vehicle{
    String name;

    void carstart(){
        System.out.println("Car is starting ");
    }
}

