package HomeWork.BankAccount;

public class BankAccount {
    int id;
    String name;
    String lastName;
    float amount;

    float popolnenieScheta(float addAmount){
        amount += addAmount;
        return amount;
    }
    float snyatieSoSchetaScheta(float addAmount){
        amount -= addAmount;
        return amount;
    }
}

class NewBankAccount{
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();
        account1.name = "Mike1";
        account2.name = "Mike2";
        account3.name = "Mike3";
        account1.id = 1;
        account2.id = 2;
        account3.id = 3;
        account1.lastName = "Stoba1";
        account2.lastName = "Stoba2";
        account3.lastName = "Stoba3";
        account1.amount = 1;
        account2.amount = 2.5f;
        account3.amount = 3.8f;
        account1.popolnenieScheta(50);
        account2.snyatieSoSchetaScheta(25);
        account3.popolnenieScheta(85);

        System.out.println(account1.name + " " + account1.lastName + " " + account1.id + " " + account1.amount);
        System.out.println(account2.name + " " + account2.lastName + " " + account2.id + " " + account2.amount);
        System.out.println(account3.name + " " + account3.lastName + " " + account3.id + " " + account3.amount);
        System.out.println(account1.amount);
        System.out.println(account2.amount);
        System.out.println(account3.amount);
    }

}

