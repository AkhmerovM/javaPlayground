package theory.multithreading.waitNotify;


import java.util.concurrent.atomic.AtomicInteger;

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
    public synchronized void deposit (int val) throws InterruptedException {
        if (value > 22000) {
            wait();
        }
        System.out.println(value);
        value+=val;
        notify();
    }
    public synchronized void withdraw (int val) throws InterruptedException {
        if (value <18000) {
            wait();
        }
        System.out.println(value);
        value-=val;
        notify();
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
            try {
                account.deposit(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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
            try {
                account.withdraw(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
