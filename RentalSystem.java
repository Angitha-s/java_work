interface Vehicle {
    public void start();
    public void stop();    
}
interface Fuelbased{
    public void refuel();   
}
class car implements Vehicle,Fuelbased{
    public void start(){
        System.out.println("Car started");
    }
    public void stop(){
        System.out.println("Car stoped");
    }
    public void refuel(){
        System.out.println("Car refueled");
    }
}
class electricscooter implements Vehicle{
    public void start(){
        System.out.println("Electric scooter started");
    }
    public void stop(){
        System.out.println("Electric scooter stoped");
    }
}
public class RentalSystem {

    public static void main(String[] args) {
        car c=new car();
        electricscooter e=new electricscooter();
        c.start();
        c.stop();
        c.refuel();
        e.start();
        e.stop();
    }
}

