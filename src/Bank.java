import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("******** Bank DayBank ********");
        System.out.println("******************************");

        int uniqueToken = 123456789;
        int menuBank = 0;
        int userBalance = 14423;
        int optionBank = 0;

        for (int trys = 1; trys >= 1; trys--) {
            System.out.println("You have " + trys + " tries");
            System.out.println("Enter your unique token: ");
            uniqueToken = in.nextInt();
            if (uniqueToken == 123456789) {
                System.out.println("You have successfully logged in!");
                menuBank = 1;
            } else {
                System.out.println("You have not successfully logged in!");
                menuBank = 2;
            }
            break;
        }

        while (menuBank == 1) {
            String userName = "Jake Wang Ling";
            String typeAccount = "Current";
            System.out.println("******************************");
            System.out.println("********* Welcome ***********");
            System.out.println("******************************");
            System.out.println("Name: " + userName);
            System.out.println("Type account: " + typeAccount);
            System.out.println("Account balance: $" + userBalance);
            System.out.println("Choose your option!");
            System.out.println("1 - Transfer value\n2 - Check Balance\n3 - Receive money\n4 - Exit");
            optionBank = in.nextInt();
            switch (optionBank) {
                case 1:
                    System.out.println("Transfer option selected");
                    System.out.println("Value?");
                    int transferValue = in.nextInt();
                    if (transferValue <= userBalance) {
                        userBalance -= transferValue;
                        System.out.println("Transfer great! Your value: " + userBalance);
                    } else {
                        System.out.println("Insufficient founds!");
                    }
                    break;
                case 2:
                    System.out.println("Check balance option selected");
                    System.out.println("Your balance: $" + userBalance);
                    System.out.println("Press 0 for exit");
                    int pressKey = in.nextInt();
                    if (pressKey == 0) {
                        break;
                    } else {
                        System.out.println("Invalid key!");
                    }
                    break;
                case 3:
                    System.out.println("Receive money option selected");
                    System.out.println("Enter the amount to receive:");
                    int valueReceive = in.nextInt();
                    if (valueReceive > 0) {
                        userBalance += valueReceive;
                        System.out.println("Amount received: $" + valueReceive + "\nUpdated total balance: $" + userBalance);
                    } else {
                        System.out.println("Invalid Value!");
                    }
                    System.out.println("Press 0 for exit");
                    pressKey = in.nextInt();
                    if (pressKey == 0) {
                        break;
                    } else {
                        System.out.println("Invalid key!");
                    }
                case 4:
                    System.out.println("You will disconnect in a few moments\nThank you for your preference!");
                    System.out.println("******************************");
                    menuBank = 3;
                    break;
                default:
                    System.out.println("Invalid!");
            }
        }
        switch (menuBank) {
            case 2:
                System.out.println("Cannot access bank account!");
                break;
            case 3:
                break;
        }
    }
}
