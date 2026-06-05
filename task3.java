import java.util.Scanner;

class Wallet {
    private static int counter = 1;
    private final int id;
    private int balance;

    public Wallet() {
        this.id = counter++;
        this.balance = 0;
    }

    public Wallet(int initialBalance) {
        this.id = counter++;
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient balance!");
        } else {
            this.balance -= amount;
        }
    }

    public int getBalance() {
        return this.balance;
    }

    public int getId() {
        return this.id;
    }
}

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Wallet wallet1 = new Wallet();
        Wallet wallet2 = new Wallet(1000);

        System.out.println("Wallet 1 ID: " + wallet1.getId() + ", Balance: " + wallet1.getBalance());
        System.out.println("Wallet 2 ID: " + wallet2.getId() + ", Balance: " + wallet2.getBalance());

        System.out.print("Enter amount to deposit in Wallet 1: ");
        wallet1.deposit(sc.nextInt());

        System.out.print("Enter amount to withdraw from Wallet 2: ");
        wallet2.withdraw(sc.nextInt());

        System.out.println("\nWallet 1 ID: " + wallet1.getId() + ", Balance: " + wallet1.getBalance());
        System.out.println("Wallet 2 ID: " + wallet2.getId() + ", Balance: " + wallet2.getBalance());
    }
}
