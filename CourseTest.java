class Program{
    public static int Total=0;
    String name;
    int duration;
    int enrolled;
    Program(String name, int duration, int enrolled) {
        this.name = name;
        this.duration = duration;
        this.enrolled = enrolled;
        Total += enrolled;
    }

    class Platform {
        final String creator = "CodeMentor Academy";
        public void display() {
            System.out.println("Courses are hosted on CodeMentor");
        }
    }
}

public class CourseTest {
    public static void main(String[] args) {
        Program a = new Program("Java", 6, 2);
        Program b = new Program("Python", 7, 3);

        Program.Platform c = a.new Platform();

        System.out.println("Course 1");
        System.out.println("Course: " + a.name + ", Duration: " + a.duration + " months, Students enrolled: " + a.enrolled);
        System.out.println("Creator: "+c.creator);
        System.out.println("Course 2");
        System.out.println("Course: " + b.name + ", Duration: " + b.duration + " months, Students enrolled: " + b.enrolled);
        System.out.println("Creator: "+c.creator);
        c.display();

        System.out.println("Total students enrolled: " + Program.Total);
    }
}