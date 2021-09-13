public class Savings extends Account {
    int interestrate;
    public Savings(String n,String ad,String pn,String an,String dc)
    {
        name=n;
        address=ad;
        phoneNo=pn;
        accountNo=an;
        balance=0;
        dateCreated=dc;
        //   statement="";
    }
    public boolean makeWithdrawal(int amount,int time)
    {
        if(balance-amount<0)
        {
            System.out.println("Cannot withdraw amount greater than your balance");
            return false;
        }
        else
        {
            balance-=amount;
        }
        return true;
    }
    public int calculatelnterest()
    {

        return (int)(interestrate*balance);
    }
}
