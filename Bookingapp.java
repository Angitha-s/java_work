import java.util.Scanner;
abstract class Ride {
    abstract int calculateFare(int distance);
    public void ridetype(){
        System.out.println("Generic ride");
    } 
}
class AutoRide extends Ride {
    public int calculateFare(int distance){
        return distance * 10;
    }
    public void ridetype(){
        System.out.println("Auto Ride");
    }   
}
class CarRide extends Ride {
     public int calculateFare(int distance){
        return distance * 20;
    }
    public void ridetype(){
        System.out.println("Car Ride");
    }      
}
public class Bookingapp {
    public static void main(String[] args) {
        Scanner c= new Scanner(System.in);
        System.out.println("Choose auto or car");
        String choose= c.nextLine();
        System.out.println("Enter the kilometer to travel");
        int km=c.nextInt();
        c.close();
        Ride a;
        if (choose.equals("auto")) {
            a = new AutoRide();   
        }
        else{
            a = new CarRide();
        }

        a.ridetype();
        System.out.println("Total fare " + a.calculateFare(km));
    }
}