                                                           // ATM Interface

import java.util.Scanner;  
public class ATM {  
    private double balance;  

    public ATM() {  
        this.balance = 0.0; // Initial balance is 0  
    }  

    public void deposit(double amount) {  
        if (amount > 0) {  
            balance += amount;  
            System.out.println("Deposited: Rs " + amount);  
        } else {  
            System.out.println("Deposit amount must be positive!");  
        }  
    }  

    public void withdraw(double amount) {  
        if (amount > 0 && amount <= balance) {  
            balance -= amount;  
            System.out.println("Withdrawn: Rs " + amount);  
        } else if (amount > balance) {  
            System.out.println("Insufficient funds!");  
        } else {  
            System.out.println("Withdrawal amount must be positive!");  
        }  
    }  

    public void checkBalance() {  
        System.out.println("Current balance: Rs " + balance);  
    }  

    public static void main(String[] args) {  
        ATM atm = new ATM();  
        Scanner scanner = new Scanner(System.in);  
        int option;  

        do {  
            System.out.println("\nATM Menu:");  
            System.out.println("1. Deposit");  
            System.out.println("2. Withdraw");  
            System.out.println("3. Check Balance");  
            System.out.println("4. Exit");  
            System.out.print("Select an option: ");  
            option = scanner.nextInt();  

            switch (option) {  
                case 1:  
                    System.out.print("Enter amount to deposit Rs : ");  
                    double depositAmount = scanner.nextDouble();  
                    atm.deposit(depositAmount);  
                    break;  
                case 2:  
                    System.out.print("Enter amount to withdraw Rs : ");  
                    double withdrawAmount = scanner.nextDouble();  
                    atm.withdraw(withdrawAmount);  
                    break;  
                case 3:  
                    atm.checkBalance();  
                    break;  
                case 4:  
                    System.out.println("Thank you for using the ATM!");  
                    break;  
                default:  
                    System.out.println("Invalid option! Please try again.");  
            }  
        } while (option != 4);  

        scanner.close();  
    }  
}

