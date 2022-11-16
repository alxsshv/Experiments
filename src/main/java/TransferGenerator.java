import java.util.HashMap;
import java.util.Map;

public class TransferGenerator implements Runnable {
    private final Bank bank;

    public TransferGenerator(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        System.out.println("Cуммарные средства в банке: " + bank.getSumAllAccounts());
        for (int i = 0; i < 100; i++) {
            generateTransfer();
        }
        System.out.println("Cуммарные средства в банке: " + bank.getSumAllAccounts());
    }

    private synchronized void generateTransfer(){
        String fromAccountNum = String.valueOf ((int) (Math.random() * bank.getAccounts().size()));
        String toAccountNum = String.valueOf ((int) (Math.random() * bank.getAccounts().size()));
        long amount = (int) (Math.random() * 60000);
        System.out.println("fromAccountNum: " + fromAccountNum);
        System.out.println("toAccountNum: " + toAccountNum);
        System.out.println("Сумма перевода: " + amount);
        bank.transfer(fromAccountNum,toAccountNum, amount);
    }

    public void generateAccounts (){
        Map<String, Account> accounts = new HashMap<>();
        for (int i = 1; i < 100; i++) {
            long amount = (int) (Math.random() * 60000);
            accounts.put(String.valueOf(i), new Account(amount,String.valueOf(i),true));
        }
        bank.setAccounts(accounts);
    }

    public Bank getBank() {
        return bank;
    }
}
