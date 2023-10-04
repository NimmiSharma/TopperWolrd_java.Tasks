import java.util.Scanner;

public class Task2ATM {

    // Simulated account balance
    private static double accountBalance = 1000.00;
    private static String accountNumber1 = "123456";

    private static String accountNumber2="234567";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre you accountNumber");
        Scanner sc=new Scanner(System.in);
        String inputAccountNumber = String.valueOf(sc.nextInt());

        if (authenticate(inputAccountNumber)) {
            displayMenu();

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        withdraw(scanner);
                        break;
                    case 2:
                        deposit(scanner);
                        break;
                    case 3:
                        checkBalance();
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }


    private static boolean authenticate(String inputAccountNumber) {
        return accountNumber1.equals(inputAccountNumber);

    }

    private static void displayMenu()

    {
        System.out.println("Welcome to the ATM Machine");
        System.out.println("Choose 1. Withdraw");
        System.out.println("Choose 2. Deposit");
        System.out.println("Choose 3. Check Balance");
        System.out.println("3. Exit");
        System.out.print("Please choose the operation: ");
    }


    private static void checkBalance () {
            System.out.println("Your account balance is: $" + accountBalance);
        }

        private static void withdraw (Scanner scanner){
            System.out.print("Enter the money to withdraw: $");
            double amount = scanner.nextDouble();

            if (amount <= 0) {
                System.out.println("Invalid amount. Please enter a positive amount.");
            } else if (amount > accountBalance) {
                System.out.println("Insufficient funds. Your account balance is $" + accountBalance);
            } else {
                accountBalance -= amount;
                System.out.println("Withdrawal successful. Your new balance is $" + accountBalance);
            }
        }
        private static void deposit (Scanner scanner){
            System.out.print("Enter the amount to deposit: $");

            double amount = scanner.nextDouble();

            if (amount <= 0) {
                System.out.println("Invalid amount. Please enter a positive amount.");
            } else {
                accountBalance += amount;
                System.out.println("Your money successfully deposited" + accountBalance);
            }
        }
    }
