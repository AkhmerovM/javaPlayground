package theory.multithreading.semaphore;


import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(21);
        Account account = new Account(20000);
        DepositThread depositThread = new DepositThread(account, semaphore);
        WithDrawThread withDrawThread = new WithDrawThread(account, semaphore);

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
            value -= val;
    }
}
class DepositThread extends Thread {
    private final Account account;
    private final Semaphore semaphore;
    public DepositThread(Account account, Semaphore semaphore) {
        this.account = account;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            try {
                semaphore.acquire();
                account.deposit(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }
    }
}

class WithDrawThread extends Thread {
    private final Account account;
    private final Semaphore semaphore;
    public WithDrawThread(Account account, Semaphore semaphore) {
        this.account = account;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            try {
                semaphore.acquire();
                account.withdraw(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }
    }
}
