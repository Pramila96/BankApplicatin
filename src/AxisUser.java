import java.util.Objects;

public class AxisUser implements BankInterface{
    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private double rateOfInterest;

    public AxisUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
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

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public double checkBalance() {
      return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance=balance+amount;
        return "Your new Axis balance is"+balance;
    }

    @Override
    public String withdrawMoney(int amount, String enteredpassword) {
        if(Objects.equals(enteredpassword,password))
        {
            if(amount>balance)
            {
                return " insufficient balance ";
            }
            else
            {
                balance=balance-amount;
                return "Withdraw Successfully from Axis account"+balance;
            }
        }
        else {
            return "Wrong password for axis account";
        }
    }

    @Override
    public double calculateInterest(int years) {
        return (balance*rateOfInterest*years)/100;
    }
}
