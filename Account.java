package account;
import java.util.Date;
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dataCreated;
    public Account(){
        id=0;
        balance=0;
        annualInterestRate=0;
        dataCreated= new Date();
    }
    public Account(int ID,int Balance){
        id=ID;
        balance=Balance - Balance*(annualInterestRate/100/12);
    }
    public int getID() {
        return id;
    }
    public double getBalance() {
        return balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public Date getDataCreated () {
       return dataCreated;
    }
    public void setID(int ID){
        ID=id;
    }
    public void setbalance(double Balance ){
        balance=Balance -Balance*(annualInterestRate/100/12);
    }
    public void setannualinterestrate(double AnnualInterestRate){
        AnnualInterestRate=annualInterestRate;
    }
    public double getMonthlyinterestrate(){
        double res=annualInterestRate/12;
        return(res);
    }
    
    public void withdraw(double amount){
        balance-=amount;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public static void main(String[] args) {
        Account a1=new Account(1122,20000);
        a1.annualInterestRate=4.5;
        a1.withdraw(2500);
        a1.deposit(3000);
        System.out.println("balance= "+a1.balance);
        System.out.println("monthly interest= "+a1.balance*(a1.getMonthlyinterestrate()/100)+"%");
        System.out.println("this account was created in "+a1.getDataCreated());
    }
    
}
