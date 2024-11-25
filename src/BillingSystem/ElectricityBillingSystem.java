package BillingSystem;
import java.util.Scanner;

class ElectricityBill {
    private String customerName;
    private int meterNumber;
    private int consumedUnits;
    private double billAmount;

    // Constructor
    public ElectricityBill(String customerName, int meterNumber, int consumedUnits) {
        this.customerName = customerName;
        this.meterNumber = meterNumber;
        this.consumedUnits = consumedUnits;
        this.billAmount = calculateBill();
    }

    // Method to calculate the bill amount based on consumption slabs
    private double calculateBill() {
        double amount;
        if (consumedUnits <= 100) {
            amount = consumedUnits * 1.50;
        } else if (consumedUnits <= 300) {
            amount = 100 * 1.50 + (consumedUnits - 100) * 2.00;
        } else {
            amount = 100 * 1.50 + 200 * 2.00 + (consumedUnits - 300) * 3.00;
        }
        return amount;
    }

    // Method to display the bill details
    public void displayBill() {
        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Meter Number: " + meterNumber);
        System.out.println("Units Consumed: " + consumedUnits);
        System.out.printf("Total Bill Amount: $%.2f%n", billAmount);
    }
}
public class ElectricityBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Meter Number: ");
        int meterNumber = scanner.nextInt();

        System.out.print("Enter Units Consumed: ");
        int units = scanner.nextInt();

        // Create an ElectricityBill object
        ElectricityBill bill = new ElectricityBill(name, meterNumber, units);

        // Display the generated bill
        bill.displayBill();

        scanner.close();
    }
}
