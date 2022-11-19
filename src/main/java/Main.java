

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        TransferGenerator generator = new TransferGenerator(bank);
        generator.generateAccounts();
        for (int i = 1; i < 20; i++) {
            new Thread(generator).start();
        }




    }
}
