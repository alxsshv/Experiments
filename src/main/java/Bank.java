
import java.util.Hashtable;
import java.util.Map;
import java.util.Random;

public class Bank {

    private volatile Map<String, Account> accounts = new Hashtable<>();

    private final Random random = new Random();

    public synchronized boolean isFraud(String fromAccountNum, String toAccountNum, long amount)
            throws InterruptedException {
        Thread.sleep(1000);
        return random.nextBoolean();
    }

    /**
     * TODO: реализовать метод. Метод переводит деньги между счетами. Если сумма транзакции > 50000,
     * то после совершения транзакции, она отправляется на проверку Службе Безопасности – вызывается
     * метод isFraud. Если возвращается true, то делается блокировка счетов (как – на ваше
     * усмотрение)
     */
    public synchronized void transfer(String fromAccountNum, String toAccountNum, long amount) {
        Transfer tr = null;
        while (tr == null) {
            tr = takeAccounts(fromAccountNum, toAccountNum, amount);
        }
        if (tr.run()) {
            try {
                boolean isBlockAccounts = false;
                if (amount >= 50000) {
                    System.out.println("Проверка службой безопасности банка");
                    isBlockAccounts = isFraud(fromAccountNum, toAccountNum, amount);
                }
                if (isBlockAccounts) {
                    System.out.println("Операция не прошла проверку подлинности, счета заблокированы");
                    tr.deactivateAccounts();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        accounts.put(fromAccountNum, tr.getFromAccount());
        accounts.put(toAccountNum, tr.getToAccount());
        accounts.get(fromAccountNum).setBusy(false);
        accounts.get(toAccountNum).setBusy(false);
    }

    /**
     * TODO: реализовать метод. Возвращает остаток на счёте.
     */
    public long getBalance(String accountNum) {
        return accounts.get(accountNum).getMoney();
    }

    public long getSumAllAccounts() {
        long totalSum = 0;
        for (Map.Entry<String, Account> entry : accounts.entrySet()){
            totalSum = totalSum + entry.getValue().getMoney();
        }
     return totalSum;
    }


    private synchronized Transfer takeAccounts(String fromAccountNum, String toAccountNum, long amount){
        if (!accounts.get(fromAccountNum).isBusy() && !accounts.get(fromAccountNum).isBusy()){
            accounts.get(fromAccountNum).setBusy(true);
            accounts.get(toAccountNum).setBusy(true);
            Transfer tr = new Transfer(accounts.get(fromAccountNum),accounts.get(toAccountNum), amount);
            return tr;
        }
        return null;
    }

    public Map<String, Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Map<String, Account> accounts) {
        this.accounts = accounts;
    }

}
