
import java.util.Hashtable;
import java.util.Map;
import java.util.Random;

public class Bank {

    private Map<String, Account> accounts = new Hashtable<>();

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
        Transfer transfer = new Transfer(accounts.get(fromAccountNum),accounts.get(toAccountNum), amount);
        transfer.execute();
        if (runSecurityCheck(fromAccountNum, toAccountNum, amount)) {
            System.out.println("Операция не прошла проверку подлинности, счета заблокированы");
            transfer.deactivateAccounts();
        }
        accounts.put(fromAccountNum, transfer.getFromAccount());
        accounts.put(toAccountNum, transfer.getToAccount());
    }

    public synchronized boolean runSecurityCheck(String fromAccountNum, String toAccountNum, long amount){
        if (amount >= 50000) {
            System.out.println("Проверка службой безопасности банка");
            try {
                return isFraud(fromAccountNum, toAccountNum, amount);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return false;
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

    public Map<String, Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Map<String, Account> accounts) {
        this.accounts = accounts;
    }

}
