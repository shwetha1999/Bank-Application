import java.util.UUID;
import java.util.*;
import java.lang.*;
public class SBIUser implements BankInterface{
    //attributes
    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private  Double rateOfInterest;

    public SBIUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.rateOfInterest = 6.5;
        this.accountNo = String.valueOf(UUID.randomUUID());
        //Universally unique Identifier generates unique 16 digit HexaDecimal number
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(Double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance = balance+amount;
        return "your current balance is "+ balance;
    }

    @Override
    public String withdrawMoney(int amount, String enterPassword) {
       if(Objects.equals(enterPassword,password))
       //since everything in java is objects we are comparing 2 string objects
       {
           if(amount>balance)
           {return "Sorry! Insufficient Money";}
           else {
               balance = balance-amount;
               return "now Remaning balance is "+balance;
           }
       }
       else
       {return "Wrong Password";}
    }

    @Override
    public double calculateInterset(int years) {
        return (balance*years*rateOfInterest)/100;
    }
    //making static so that rate of interest
    //is constant so no one outside the class can change it

}
