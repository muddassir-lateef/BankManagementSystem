public class checking extends Account{
    public checking(String n,String ad,String pn,String an,String dc)
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
        if(balance-amount<-5000)
        {
            System.out.println("Cannot withdraw amount greater than your balance+5000");
            return false;
        }
        else
        {
            balance-=amount;
        }
        return true;
    }
}
