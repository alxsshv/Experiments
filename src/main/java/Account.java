
public class Account {

    private long money;
    private String accNumber;
    private volatile boolean isActive;


    public Account(long money, String accNumber, boolean isActive) {
        this.money = money;
        this.accNumber = accNumber;
        this.isActive = isActive;

    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }





    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                ", accNumber='" + accNumber + '\'' +
                ", isActive=" + isActive +
                '}';
    }

}
