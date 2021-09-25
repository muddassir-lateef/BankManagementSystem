public class Customer {
    public int Customerid;
    public Savings savingAccount=null;
    public checking checkingAccount=null;
    public Customer(int id)
    {
        Customerid=id;
    }
    public boolean opensaving(String n,String ad,String pn,String AccountNo,String dc)
    {
        if(savingAccount!=null)
            return false;
        else
            savingAccount=new Savings(n,ad,pn,AccountNo,dc);
        return true;
    }
    public boolean openchecking(String n,String ad,String pn,String AccountNo,String dc)
    {
        if(checkingAccount!=null)
            return false;
        else
            checkingAccount=new checking(n,ad,pn,AccountNo,dc);
        return true;
    }
}
