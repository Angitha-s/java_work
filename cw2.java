public class cw2 {
    public static void main(String args[]) {
        int total = 0;
        int stock[] = new int[5];
        stock[0] = 20;
        stock[1] = 15;
        stock[2] = 30;
        stock[3] = 0;
        stock[4] = 25;

        for (int i = 0; i < stock.length; i++) {
            if (stock[i] == 0) {
                System.out.println("Out of stock");
                break;
            }
            total += stock[i];
        }

        System.out.println("Total stock: " + total);

        if (total < 50) {
            System.out.println("Low");
        } else if (total > 50 && total < 100) {
            System.out.println("Moderate");
        } else {
            System.out.println("Good");
        }
    }
}