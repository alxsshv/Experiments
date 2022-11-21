import junit.framework.TestCase;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        TransferGenerator generator = new TransferGenerator(bank);
        for (int i = 1; i < 1000; i++) {
            new Thread(generator).start();
        }
        bank = generator.getBank();
        long actual = bank.getSumAllAccounts();
        long expected = 4950000;
        assertEquals(expected, actual);
    }
}
