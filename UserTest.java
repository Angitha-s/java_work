abstract class user {
abstract void showMessage();
     public void displayUserType() {
        System.out.println("User Type selected");
    }
}
 class Adminuser extends user {
    public void showMessage(){
    System.out.println("Welcome,admin!");
    }
    
}
class Guestuser extends user {
    public void showMessage(){
    System.out.println("Welcome,guest!");
    }
    
}
public class UserTest {
    public static void main(String[] args) {
        Adminuser a= new Adminuser();
        a.displayUserType();
        a.showMessage();
        Guestuser b= new Guestuser();
        b.displayUserType();
        b.showMessage();

    }
    
}
