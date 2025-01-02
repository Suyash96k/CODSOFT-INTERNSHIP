import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base currency
        System.out.println("Enter the base currency (e.g., USD):");
        String baseCurrency = scanner.nextLine().toUpperCase();

        // Input target currency
        System.out.println("Enter the target currency (e.g., Rupee):");
        String targetCurrency = scanner.nextLine().toUpperCase();

        // Input amount
        System.out.println("Enter the amount to convert:");
        double amount;
        try {
            amount = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount. Please enter a numeric value.");
            return;
        }

        // Hardcoded exchange rate for simplicity
        double exchangeRate = 84; // Example: 1 USD = 0.85 EUR

        // Perform conversion
        double convertedAmount = amount * exchangeRate;

        // Display result
        System.out.printf("Converted Amount: %.2f %s%n", convertedAmount, targetCurrency);

        scanner.close();
    }
}
