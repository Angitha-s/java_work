class Course{
    public static int track=0;
    String name;
    int duration;
     Course(){
         name="Java";
         duration=6;
         track++;
    }
    Course(String name,int duration ){
        this.name=name;
        this.duration=duration;
        track++;

    }
    class CourseMaterial{
        final String tcname="Abin's Training centre";
        public void dispaly(){
            System.out.println("Materials provided for this course.");
        }
}
}
public class Training {
public static void main(String[] args) {
    Course a=new Course();
    Course b= new Course("Python",7);
    Course.CourseMaterial c=a.new CourseMaterial();
    Course.CourseMaterial d=b.new CourseMaterial();
    System.out.println("First course: "+a.name);
    System.out.println("Duration: "+a.duration+ "months");
    c.dispaly();
    System.out.println("Second course: "+b.name);
    System.out.println("Duration: "+b.duration+ "months");
    d.dispaly();
   System.out.println(c.tcname);
   System.out.println("Total course "+Course.track);

}
    
}
