import java.io.*;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Bank {
    ArrayList<Customer> accounts=null;
    int latestaccount;
    public Bank()
    {
        latestaccount=0;
        accounts= new ArrayList<Customer>();
    }

    public boolean Register(int type,String name, String address,String phNo)
    {
        latestaccount++;
        accounts.add(new Customer(latestaccount));
        if(type==1)
        {
            accounts.get(accounts.size()-1).opensaving(name,address,phNo,AccountNoGen(112,111,latestaccount),"1-1-2002");
        }
        else if(type==2)
        {
            accounts.get(accounts.size()-1).openchecking(name,address,phNo,AccountNoGen(112,222,latestaccount),"1-1-2002");
        }
        return true;
    }
   // public Account find()
   // {
       // for(int i=0;i<accounts.size();i++)
     //   {


   //     }

 //   }

    public String AccountNoGen(int branchCode,int typecode,int id)
    {
        //Account number format:
        //BranchCode(3 digit) -Account type code(3 digit)-AccountNumber(4 digit)-RandomRNG(3-digit)

        int max=999;
        int min=100;
        int RNG=(int)Math.floor(Math.random()*(max-min+1)+min);
        return String.format("%03d", branchCode)+"-"+String.format("%03d", typecode)+"-"+String.format("%04d", id)+"-"+String.format("%03d", RNG);
    }

}
