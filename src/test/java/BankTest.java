import junit.framework.TestCase;
import net.jodah.concurrentunit.Waiter;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class BankTest  extends TestCase {
    Bank bank = new Bank();
    @Override
    protected void setUp() {
        Map<String, Account> accounts = new HashMap<>();
        for (int i = 0; i < 100; i++){
            accounts.put(String.valueOf(i), new Account(i*1000,String.valueOf(i),true));
        }
        bank.setAccounts(accounts);
    }

    public void testGetBalance(){
        long actual = bank.getBalance("1");
        long expected = 1000;
        assertEquals(expected,actual);
    }

    public void testGetSumAllAccounts(){
        long actual = bank.getSumAllAccounts();
        long expected = 4950000;
        assertEquals(expected,actual);
    }

    public void testTransferOneThreadMode(){
        bank.transfer("55","1",52000);
        boolean totalSumIsEquals = bank.getSumAllAccounts() == 4950000;
        boolean balance55IsEquals = bank.getBalance("55") == 3000;
        boolean balance1IsEquals = bank.getBalance("1") == 53000;
        boolean actual = totalSumIsEquals && balance55IsEquals && balance1IsEquals;
        boolean expected = true;
        assertEquals(expected, actual);
    }

    public void testTransferMultiThreadMode(){
        Waiter waiter = new Waiter();
        int threadCount = 50;
        for (int i = 1; i < threadCount+1; i++) {
           new Thread(() -> {
               for (int j = 0; j < 100; j++) {
                   System.out.println("Перевод №" + j);
                   String fromAccountNum = String.valueOf((int) (Math.random() * bank.getAccounts().size()));
                   String toAccountNum = String.valueOf((int) (Math.random() * bank.getAccounts().size()));
                   long amount = (int) (Math.random() * 60000);
                   bank.transfer(fromAccountNum, toAccountNum, amount);
               }
               System.out.println("Cуммарные средства в банке: " + bank.getSumAllAccounts());
               waiter.resume();
           }).start();
        }
        long actual = bank.getSumAllAccounts();
        long expected = 4950000;
        assertEquals(expected, actual);
        try {
            waiter.await(1000, TimeUnit.SECONDS, threadCount);
        } catch (TimeoutException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
