import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class hw3{
    public static double calculateFinalAmount(double total) {
        if (total > 500) {
            total = total - (total * 0.10);
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] items = {"Rice", "Sugar", "Oil", "Soap", "Milk"};
        int[] prices = {50, 40, 100, 25, 30};
        int[] quantities = new int[items.length];
        double totalCost = 0;
        System.out.println("Available items");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i] + " - Rs." + prices[i] + " per unit");
        }
        for (int i = 0; i < items.length; i++) {
            while (true) {
                try {
                    System.out.print("Enter quantity for " + items[i] + ": ");
                    quantities[i] = Integer.parseInt(sc.nextLine());
                    if (quantities[i] < 0) {
                        System.out.println("Quantity cannot be negative. Enter again.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                }
            }
        }
        for (int i = 0; i < items.length; i++) {
            totalCost += quantities[i] * prices[i];
        }
        double finalAmount = calculateFinalAmount(totalCost);
        System.out.println("\nTotal Cost: Rs." + totalCost);
        if (totalCost > 500) {
            System.out.println("Discount applied (10%).");
        }
        System.out.println("Final Amount to Pay: Rs." + finalAmount);
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Purchase Date & Time: " + dateTime.format(formatter));
        sc.close();
    }
}
