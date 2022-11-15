
import java.util.Map;
import java.util.Random;

public class Bank {

    private Map<String, Account> accounts;

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
    public void transfer(String fromAccountNum, String toAccountNum, long amount) {
        if (checkAccounts(fromAccountNum,toAccountNum, amount)){
            return;
        }

        long fromAccountMoney = getBalance(fromAccountNum);
        long toAccountMoney = getBalance(toAccountNum);
        accounts.get(fromAccountNum).setMoney(fromAccountMoney - amount);
        accounts.get(toAccountNum).setMoney(toAccountMoney + amount);
        try {
            boolean isBlockAccounts = false;
            if (amount > 50000) {
                isBlockAccounts = isFraud (fromAccountNum, toAccountNum, amount);
            }
            if (isBlockAccounts){
                accounts.get(fromAccountNum).setActive(false);
                accounts.get(toAccountNum).setActive(false);
            }
        } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


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
    private boolean checkAccounts (String fromAccountNum, String toAccountNum, long amount){
        boolean accountsBlocked = !accounts.get(fromAccountNum).isActive() ||
                !accounts.get(toAccountNum).isActive();
        boolean balanceIsNotEnough =  amount > accounts.get(fromAccountNum).getMoney();
        if (accountsBlocked) {
            System.out.println("ВСе операции с указанными счетами приостановлены");
        }
        if (balanceIsNotEnough) {
            System.out.println("Для выполняения перевода на счете недостаточно средств");
        }
        return balanceIsNotEnough || accountsBlocked;
    }

    public Map<String, Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Map<String, Account> accounts) {
        this.accounts = accounts;
    }

}
