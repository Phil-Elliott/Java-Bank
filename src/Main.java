package src;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int option = 0;

        System.out.println("Welcome to the Bank of Java");
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        do {
            System.out.println("Would you like to:");
            System.out.println("1) Create an account");
            System.out.println("2) Sign In");
            System.out.println("3) Do banking");
            System.out.println("4) Exit");

            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.println("Please provide a name");
                String name = scanner.nextLine();
                System.out.println("Please provide a password");
                String password = scanner.nextLine();

                bank.createAccount(name, password);
            } else if (option == 2) {
                System.out.println("What is your name");
                String name = scanner.nextLine();
                System.out.println("What is your password");
                String password = scanner.nextLine();

                bank.signIn(name, password);
            } else if (option == 3) {
                int bankingOption = 0;

                Account account = bank.getAccount();

                if (account != null) {
                    do {
                        System.out.println("Would you like to:");
                        System.out.println("1) Check balance");
                        System.out.println("2) Make a deposit");
                        System.out.println("3) Make a withdrawal");
                        System.out.println("4) Return to main menu");

                        bankingOption = scanner.nextInt();
                        scanner.nextLine();

                        
                            if (bankingOption == 1) {
                                System.out.println("Your balance is " + account.getBalance());
                            } else if (bankingOption == 2) {
                                System.out.println("How much would you like to deposit?");
                                int amount = scanner.nextInt();
                                scanner.nextLine();
                                account.deposit(amount);
                                System.out.println("Your new balance is: " + account.getBalance());
                            } else if (bankingOption == 3) {
                                System.out.println("How much would you like to withdrawal?");
                                int amount = scanner.nextInt();
                                scanner.nextLine();
                                account.withdrawal(amount);
                                System.out.println("Your new balance is: " + account.getBalance());
                            } 
                            else {
                                System.out.println("Invalid option");
                            }
                    } while (bankingOption != 4);      
                } else {
                    System.out.println("You need to sign in");
                }


            } else if (option == 4) {
                System.out.println("Thanks for banking with us");
            } else {
                System.out.println("Invalid option");
            }
        } while (option != 4);

        scanner.close();

    }
}