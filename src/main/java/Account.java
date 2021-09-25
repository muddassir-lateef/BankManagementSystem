import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class Account {

    String name;
    String address;
    String phoneNo;
    String accountNo;
    int balance;
    String dateCreated;
    String statement;
    public Account()
    {
        name=" ";
        address=" ";
        phoneNo=" ";
        accountNo=" ";
        balance=0;
        dateCreated=" ";
        //   statement=" ";
    }
    public Account(String n,String ad,String pn,String an,String dc)
    {
        name=n;
        address=ad;
        phoneNo=pn;
        accountNo=an;
        balance=0;
        dateCreated=dc;
     //   statement="";
    }
    public String getAccNum()
    {
        return accountNo;
    }
    public void display() {
        System.out.println("Account Number : " + accountNo);
        System.out.println("Name           : " + name);
        System.out.println("Phone Number   : " + phoneNo);
        System.out.println("Address        : " + address);
    }
    public boolean makeDeposit(int amount,String time,String Date)
    {
   //     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
 //       LocalDateTime now = LocalDateTime.now();
//        String dt=dtf.format(now);
        balance+=amount;
        return true;
    }

    public int checkBalance()
    {
        return balance;
    }
    public boolean makeWithdrawal(int amount,int time)
    {
        return false;
    }
    public int calculateZakat()
    {

        if (balance>=20000)
        {
            return (int)(balance*2.5)/100;
        }
        else
        {
            return 0;
        }
    }
}
