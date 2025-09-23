class  Employee{

    private String name;
    public String getname(){
        return name;
    }
    private int id;
    public int getid(){
        return id;
    }
    private String department;
    public String getdepartment(){
        return department;
    }
    private Double salary; 
    public Double getsalary(){
        return salary;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setid(int id){
        this.id=id;
    }
    public void setdepartment(String department){
        this.department=department;
    }
    public void setsalary(Double salary){
        this.salary=salary;
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println("The Employee details are:");
        Employee a= new Employee();
        a.setname("Angitha");
        a.setid(1);
        a.setdepartment("software");
        a.setsalary(25000.0);
        System.out.println("Employee 1");
        System.out.println("Name: "+a.getname());
        System.out.println("ID: "+a.getid());
        System.out.println("Department: "+a.getdepartment());
        System.out.println("Salary: "+a.getsalary());
        Employee b=new Employee();
        b.setname("Madhav");
        b.setid(2);
        b.setdepartment("Developing");
        b.setsalary(30000.0);
        System.out.println("Employee 2");
        System.out.println("Name: "+b.getname());
        System.out.println("ID: "+b.getid());
        System.out.println("Department: "+b.getdepartment());
        System.out.println("Salary: "+b.getsalary());
    }
}
