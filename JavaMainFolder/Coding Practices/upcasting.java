public class upcasting{
    public static void main(String args[]){
        Car c = new Car();
        c.drive();// no upcasting 
        Vehicle vh = new Car(); // upcasting 
        vh.drive();
        
    }
}

class Vehicle{
    public void drive(){
        System.out.println("Drive vehicle to travel");
    } 
}
class Car extends Vehicle{
    public void drive(){
        System.out.println("Drive car to travel");
    }
}

//upcasting is nothing but creating child object and storing the child object in parent class reference so the prcess is happening in upwards means child to parent so it is named as upcasting 