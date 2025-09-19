import java.util.Scanner;
public class hw1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] sales=new int[5][3];
        System.out.println("Enter sales data for 5 days (3 products each day):");
        for(int day=0;day<5;day++){
            System.out.println("Day " + (day + 1) + ": ");
            for(int product=0;product<3;product++){
                System.out.print("  Product " + (product + 1) + ": ");
                sales[day][product]=input.nextInt();
            }
        }
        int[]totalSales=new int[3];
        for(int product=0;product<3;product++){
            int sum=0;
            for(int day=0;day<5;day++){
                sum += sales[day][product];
                
            }
            totalSales[product]=sum;
        }
        System.out.println("Weekly Sales Report ");
        for(int product=0;product<3;product++){
            System.out.print("Product " + (product + 1) + " - Total Sales: " + totalSales[product] + " :- ");
            if (totalSales[product]>=500) {
                System.out.println("Target Achieved");
            }
            else if (totalSales[product]>=300) {
                System.out.println("Average Performance");
            }
            else{
                System.out.println("Needs Improvement");
            }

        }
        input.close();
    }
}
