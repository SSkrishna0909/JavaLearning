package BillingSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }
}
public class BillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Item> items = new ArrayList<>();
        String choice;

        do {
            System.out.println("Enter item details:");

            System.out.print("Item name: ");
            String name = scanner.nextLine();
            System.out.print("Price per unit: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            items.add(new Item(name, price, quantity));

            System.out.print("Do you want to add another item? (yes/no): ");
            choice = scanner.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("\n--- BILL DETAILS ---");
        double grandTotal = 0;
        System.out.printf("%-20s %-10s %-10s %-10s%n", "Item Name", "Price", "Quantity", "Total Cost");
        System.out.println("--------------------------------------------------------");

        for (Item item : items) {
            double totalCost = item.getTotalCost();
            System.out.printf("%-20s %-10.2f %-10d %-10.2f%n", item.getName(), item.getPrice(), item.getQuantity(), totalCost);
            grandTotal += totalCost;
        }

        System.out.println("--------------------------------------------------------");
        System.out.printf("Grand Total: $%.2f%n", grandTotal);
        System.out.println("Thank you for using the Billing System!");

        scanner.close();
    }

}
