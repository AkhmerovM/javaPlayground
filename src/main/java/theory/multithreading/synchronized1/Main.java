package theory.multithreading.synchronized1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(20000);

        DepositThread depositThread = new DepositThread(account);
        WithDrawThread withDrawThread = new WithDrawThread(account);

        depositThread.start();
        withDrawThread.start();


         depositThread.join();
        withDrawThread.join();
        System.out.println(account.getValue());
    }
}
class Account {
    public Account(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    private int value;
    public synchronized void deposit (int val) {
        value+= val;
    }
    public synchronized void withdraw (int val) {
        value-= val;
    }
}
class DepositThread extends Thread {
    private final Account account;
    public DepositThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            account.deposit(20);
        }
    }
}

class WithDrawThread extends Thread {
    private final Account account;
    public WithDrawThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            account.withdraw(20);
        }
    }
}
