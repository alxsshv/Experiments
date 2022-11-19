public class Transfer {
    private final Account fromAccount;
    private final Account toAccount;
    private final long amount;

    public Transfer(Account fromAccount, Account toAccount, long amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    public synchronized boolean run(){
        if (!checkAccounts()){
            return false;
        }
        fromAccount.setMoney(fromAccount.getMoney() - amount);
        toAccount.setMoney(toAccount.getMoney() + amount);
        fromAccount.setBusy(false);
        toAccount.setBusy(false);
        return true;
    }

    private synchronized boolean checkAccounts (){
        boolean accountsActive = fromAccount.isActive() && toAccount.isActive();
        boolean balanceIsEnough =  amount < fromAccount.getMoney();
        if (!accountsActive) {
            System.out.println("Все операции с указанными счетами приостановлены");
            return false;
        }
        if (!balanceIsEnough) {
            System.out.println("Для выполняения перевода на счете недостаточно средств");
        }
        return balanceIsEnough && accountsActive;
    }

    public synchronized void deactivateAccounts(){
        fromAccount.setActive(false);
        toAccount.setActive(false);
    }

    public synchronized Account getFromAccount() {
        return fromAccount;
    }

    public synchronized Account getToAccount() {
        return toAccount;
    }
}
