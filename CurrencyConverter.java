import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Exchange rates (as of the current date)
        double usdToEur = 0.85;
        double usdToGbp = 0.72;
        double usdToJpy = 110.25;

        // Read the amount and source currency from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter the source currency (USD, EUR, GBP, JPY): ");
        String sourceCurrency = scanner.nextLine().toUpperCase();

        // Convert the amount to USD
        double usdAmount;
        switch (sourceCurrency) {
            case "USD":
                usdAmount = amount;
                break;
            case "EUR":
                usdAmount = amount / usdToEur;
                break;
            case "GBP":
                usdAmount = amount / usdToGbp;
                break;
            case "JPY":
                usdAmount = amount / usdToJpy;
                break;
            default:
                System.out.println("Invalid source currency.");
                return;
        }

        // Read the target currency from the user
        System.out.print("Enter the target currency (USD, EUR, GBP, JPY): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        // Convert the USD amount to the target currency
        double targetAmount;
        switch (targetCurrency) {
            case "USD":
                targetAmount = usdAmount;
                break;
            case "EUR":
                targetAmount = usdAmount * usdToEur;
                break;
            case "GBP":
                targetAmount = usdAmount * usdToGbp;
                break;
            case "JPY":
                targetAmount = usdAmount * usdToJpy;
                break;
            default:
                System.out.println("Invalid target currency.");
                return;
        }

        // Print the result
        System.out.println(amount + " " + sourceCurrency + " = " + targetAmount + " " + targetCurrency);

        scanner.close();
    }
}
