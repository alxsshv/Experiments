
import java.util.Hashtable;
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

    private void generateTransfer(){
        String fromAccountNum = String.valueOf ((int) (Math.random() * bank.getAccounts().size()));
        String toAccountNum = String.valueOf ((int) (Math.random() * bank.getAccounts().size()));
        long amount = (int) (Math.random() * 60000);
        bank.transfer(fromAccountNum,toAccountNum, amount);
        System.out.println("fromAccountNum: " + fromAccountNum + ", баланс " + bank.getBalance(fromAccountNum));
        System.out.println("toAccountNum: " + toAccountNum  + ", баланс " + bank.getBalance(toAccountNum));
        System.out.println("Сумма перевода: " + amount);


    }

    public void generateAccounts (){
        Map<String, Account> accounts = new Hashtable<>();
        for (int i = 0; i < 100; i++) {
            long amount = (int) (Math.random() * 100000);
            accounts.put(String.valueOf(i), new Account(amount,String.valueOf(i),true));
        }
        bank.setAccounts(accounts);
    }

    public Bank getBank() {
        return bank;
    }
}
