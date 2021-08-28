package solid;

class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.transferMoney(new BankAccount(), 100);
    }
}


interface TransferMoneyProcess {
    void transferMoney(BankAccount targetAccount, int amount);
}

public class BankAccount {

    private int money;

    enum AccountType {
        Thailand,
        International
    }


    public BankAccount() {
    }

    public BankAccount(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void transferMoney(BankAccount targetAccount, int amount) {

        int remaining = targetAccount.getMoney() + amount;
        targetAccount.setMoney(remaining);
        System.out.println("Transfer money in Thailand");
    }
}
