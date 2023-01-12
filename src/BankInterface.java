public interface BankInterface {
    double checkBalance();
    String addMoney(int amount);
    String withdrawMoney(int amount,String password);
    double calculateInterset(int years);

}
