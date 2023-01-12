import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name,passwors and intial balance");
        String name=sc.next();
        String password=sc.next();
        double balance=sc.nextDouble();
        SBIUser user=new SBIUser(name,balance,password);
        System.out.println("Enter name,password,innitial balance for Axis bank account");
        String nameA=sc.next();
        String passwordA=sc.next();
        double balanceA=sc.nextDouble();
        AxisUser axis=new AxisUser(nameA,balanceA,passwordA);
       String msg=user.addMoney(5000);
        System.out.println(msg);

        String msg1=axis.addMoney(50000);
        System.out.println(msg1);

        System.out.println("Enter amount you want to withdraw");
        int money=sc.nextInt();
        System.out.println("Enter password");
        String pass= sc.next();
        System.out.println(user.withdrawMoney(money,pass));
        System.out.println("Now for axis account withdraw money");
        int moneya=sc.nextInt();
        System.out.println("Enter password");
        String passA= sc.next();
        System.out.println(axis.withdrawMoney(moneya,passA));

        System.out.println(user.calculateInterest(10));
        System.out.println(axis.calculateInterest(11));



    }
}