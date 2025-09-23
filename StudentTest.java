class Student{
    private String name;
    public String getname(){
        return name;
    }
    private int rollno;
    public int getrollno(){
        return rollno;
    }
    private double percentage;
    public double getpercentage(){
        return percentage;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setrollno(int rollno){
        this.rollno=rollno;
    }
    public void setpercentage(double percentage){
        this.percentage=percentage;
    }
}
class StudentTest {
    public static void main(String[] args) {
    Student a= new Student();
    a.setname("Angitha");
    a.setrollno(1);
    a.setpercentage(90.4);
    System.out.println("Name : "+ a.getname());
    System.out.println("Rollno : "+ a.getrollno());
    System.out.println("Percentage : "+ a.getpercentage());
    }  
}