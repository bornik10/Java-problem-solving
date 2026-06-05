package practices;

public class wallet {
    public static deposite (int balance, int amount) {
        balance = balance + amount;
        return balance;
    }
    public static withdrew (int balance, int amount ) {
        balance = balance - amount;
        return balance;
    }

    public static void main(string[] args) {
        int balance_1 = 5000;
        int balance_2 = 10000;

        balance_1 = deposite(balance_1, 2000);
        balance_2 = withdrew(balance_2, 3000);

        System.out.println("Balance 1: " + balance_1);
        System.out.println("Balance 2: " + balance_2);
    }
}