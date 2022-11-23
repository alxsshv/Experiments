import junit.framework.TestCase;
import net.jodah.concurrentunit.Waiter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class BankTest  extends TestCase {
    Bank bank = new Bank();
    @Override
    protected void setUp() {
        Map<String, Account> accounts = new HashMap();
        for (int i = 0; i < 100; i++){
            accounts.put(String.valueOf(i), new Account(i*1000,String.valueOf(i),true));
        }
        bank.setAccounts(accounts);
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
        for (int i = 1; i < 4; i++) {
           new Thread(() -> {
               for (int j = 0; j < 100; j++) {
                       System.out.println("Перевод №" + j);
                       String fromAccountNum = String.valueOf((int) (Math.random() * bank.getAccounts().size()));
                       String toAccountNum = String.valueOf((int) (Math.random() * bank.getAccounts().size()));
                       long amount = (int) (Math.random() * 60000);
                       bank.transfer(fromAccountNum, toAccountNum, amount);
                       System.out.println("fromAccountNum: " + fromAccountNum + ", баланс " + bank.getBalance(fromAccountNum));
                       System.out.println("toAccountNum: " + toAccountNum + ", баланс " + bank.getBalance(toAccountNum));
                       System.out.println("Сумма перевода: " + amount);
               }
               System.out.println("Cуммарные средства в банке: " + bank.getSumAllAccounts());
               waiter.resume();
           }).start();
        }
       // bank = generator.getBank();
        long actual = bank.getSumAllAccounts();
        long expected = 4950000;
        assertEquals(expected, actual);
        try {
            waiter.await(110, TimeUnit.SECONDS, 2);
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
