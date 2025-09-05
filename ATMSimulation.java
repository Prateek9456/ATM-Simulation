import java.util.Scanner;

public class ATMSimulation {
    private static double balance = 1000.0; // Starting balance in INR
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Welcome to ATM Simulation ===");

        boolean running = true;
        while (running) {
            showMenu();
            int choice = getValidChoice();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using ATM. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

            if (running) {
                System.out.println("\nPress Enter to continue...");
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    private static void showMenu() {
        System.out.println("\n=== ATM MENU ===");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.print("Please select an option (1-4): ");
    }

    private static int getValidChoice() {
        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());
                if (choice >= 1 && choice <= 4) {
                    return choice;
                } else {
                    System.out.print("Invalid choice. Please enter a number between 1-4: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid number (1-4): ");
            }
        }
    }

    private static void checkBalance() {
        System.out.println("\n=== BALANCE INQUIRY ===");
        System.out.printf("Your current balance is: ₹%.2f%n", balance);
    }

    private static void deposit() {
        System.out.println("\n=== DEPOSIT MONEY ===");
        System.out.print("Enter amount to deposit: ₹");

        double amount = getValidAmount();

        if (amount > 0) {
            balance += amount;
            System.out.printf("Successfully deposited ₹%.2f%n", amount);
            System.out.printf("New balance: ₹%.2f%n", balance);
        } else {
            System.out.println("Invalid amount. Deposit amount must be positive.");
        }
    }

    private static void withdraw() {
        System.out.println("\n=== WITHDRAW MONEY ===");
        System.out.printf("Current balance: ₹%.2f%n", balance);
        System.out.print("Enter amount to withdraw: ₹");

        double amount = getValidAmount();

        if (amount <= 0) {
            System.out.println("Invalid amount. Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Cannot withdraw more than your balance.");
        } else {
            balance -= amount;
            System.out.printf("Successfully withdrew ₹%.2f%n", amount);
            System.out.printf("Remaining balance: ₹%.2f%n", balance);
        }
    }

    private static double getValidAmount() {
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                // Remove rupee sign if present
                if (input.startsWith("₹")) {
                    input = input.substring(1);
                }
                double amount = Double.parseDouble(input);
                return Math.round(amount * 100.0) / 100.0; // Round to 2 decimal places
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid amount: ₹");
            }
        }
    }
}
