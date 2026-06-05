import java.util.Scanner;

class Wallet {
    private int balance;

    public Wallet(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(int amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient balance!");
        } else {
            this.balance = this.balance - amount;
        }
    }

    public int getBalance() {
        return this.balance;
    }
}
public class WallletApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance for Wallet 1: ");
        Wallet wallet1 = new Wallet(sc.nextInt());

        System.out.print("Enter initial balance for Wallet 2: ");
        Wallet wallet2 = new Wallet(sc.nextInt());

        System.out.print("Enter amount to deposit in Wallet 1: ");
        wallet1.deposit(sc.nextInt());

        System.out.print("Enter amount to withdraw from Wallet 2: ");
        wallet2.withdraw(sc.nextInt());

        System.out.println("\nWallet 1 balance: " + wallet1.getBalance());
        System.out.println("Wallet 2 balance: " + wallet2.getBalance());
    }
}
