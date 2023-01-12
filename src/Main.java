import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name,password,balalnce  to create an account");
        String name = sc.nextLine();
        String password = sc.nextLine();
        double balance = sc.nextDouble();

        SBIUser user = new SBIUser(name,balance,password);

        //add amount
        String message = user.addMoney(100000);
        System.out.println(message);

        //withdraw money
        System.out.println("Enter amount you want to withdraw");
        int money = sc.nextInt();
        sc.nextLine(); // after taking Integer input
        System.out.println("Enter your Password");
        String pass = sc.nextLine();

        System.out.println(user.withdrawMoney(money,pass));
        System.out.println("rate of interest for 10 Years is "+user.calculateInterset(10));git inti

    }
}