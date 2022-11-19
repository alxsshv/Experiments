public class Account {

    private volatile long money;
    private String accNumber;
    private volatile boolean isActive;
    private volatile boolean isBusy;


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

    public synchronized boolean isBusy() {
        return isBusy;
    }

    public synchronized void setBusy(boolean busy) {
        isBusy = busy;
    }


}
