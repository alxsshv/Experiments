public class TransactionGenerator implements Runnable{
    private final Bank bank;

    public TransactionGenerator(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        System.out.println("Cуммарные средства в банке: " + bank.getSumAllAccounts());
        for (int i = 0; i < 100; i++) {
            System.out.println("Перевод №" + i);
            String fromAccountNum = String.valueOf ((int) (Math.random() * bank.getAccounts().size()));
            String toAccountNum = String.valueOf ((int) (Math.random() * bank.getAccounts().size()));
            long amount = (int) (Math.random() * 60000);
            bank.transfer(fromAccountNum,toAccountNum, amount);
            System.out.println("fromAccountNum: " + fromAccountNum + ", баланс " + bank.getBalance(fromAccountNum));
            System.out.println("toAccountNum: " + toAccountNum  + ", баланс " + bank.getBalance(toAccountNum));
            System.out.println("Сумма перевода: " + amount);
        }
        System.out.println("Cуммарные средства в банке: " + bank.getSumAllAccounts());
    }
}
