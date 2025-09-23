import java.util.Scanner;
public class cw3 {

    public static void main(String[] args) {
       Scanner number = new Scanner(System.in);
       System.out.println("Enter number of students");
       int a=number.nextInt();
       String[] names = new String[a];
       int mark[]=new int[a];
       int student;
       for(student=0;student<a;student++){
       System.out.println("Student :" +(student + 1));
       names[student]= number.next();
       System.out.println("mark :" + names[student]);
       mark[student]=number.nextInt();
       number.close(); 
        }
        
       int total=0;
       for(student=0;student<a;student++){
        total += mark[student];
       }
       double average = total/(double)a;
       System.out.println("Average Marks" +average);
     for(student=0;student<a;student++){
        System.out.println("Name:"  + names[student] + ", Marks:" + mark[student]);
        if(mark[student] < 35){
            System.out.println("Needs Improvement");
        }
     }
    } 
}
