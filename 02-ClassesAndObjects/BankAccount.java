public class BankAccount {
    long money;
    String id;
    String owner;
    String creation_date;
    byte level;

    void checkBalance(){
        System.out.printf("You have %d money",money);
    }
    void withdraw(long amount){
        money -= amount;
        System.out.printf("You have withdrawn %d money%n",amount);
        System.out.printf("Your current balance is %d money",money);
    }
    void deposit(long amount){
        money += amount;
        System.out.printf("You have deposited %d money%n",amount);
        System.out.printf("Your current balance is %d money",money);
    }
}
