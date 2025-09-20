
interface Animal{
    public void makeSound();
    public void move();
}
class bird implements Animal {
    public void makeSound(){
    System.out.println("Bird sound:chirp");
    }
    public void move(){
        System.out.println("Bird move:fly");
    }
}
    class dog implements Animal {
    public void makeSound(){
    System.out.println("Dog sound:bark");
    }
    public void move(){
        System.out.println("Dog move:run");
    }
}
  public class zoo {
    public static void main(String[]args){
        bird b=new bird();
        dog d=new dog();
        b.makeSound();
        b.move();
        d.makeSound();
        d.move();
    } 
  }  

