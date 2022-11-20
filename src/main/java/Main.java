import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        TransferGenerator generator = new TransferGenerator(bank);
        generator.generateAccounts();
        for (int i = 1; i < 50; i++) {
            new Thread(generator).start();
        }
    }



}
