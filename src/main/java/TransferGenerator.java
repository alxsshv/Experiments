import java.util.HashMap;
import java.util.Map;

public class TransferGenerator implements Runnable {
    private final Bank bank;

    public TransferGenerator(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        String fromAccountNum = String.valueOf ((int) Math.random() * bank.getAccounts().size());
        String toAccountNum = String.valueOf ((int) Math.random() * bank.getAccounts().size());
        Long amount = ((int) Math.random() * 60000);
        bank.transfer(fromAccountNum,toAccountNum, amount);
    }

    public void generateAccounts (){
        Map<String, Account> accounts = new HashMap<>();
        for (int i = 1; i < 100; i++) {
            accounts.put(String.valueOf(i), new Account(0,String.valueOf(i),true));
        }
        bank.setAccounts(accounts);
    }
}
