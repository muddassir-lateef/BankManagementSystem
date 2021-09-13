import java.io.*;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class main{

    public static void main(String[] args)
    {
        ArrayList<Account> accounts=new ArrayList<Account>();
     //1   accounts.add(new Savings("1","2","3","4","5"));
     //   accounts.get(0).display();
        System.out.println("hi");
        Scanner sc= new Scanner(System.in);
        int account=1;
        int op=-1;
        while(op!=0)
        {
            System.out.println("1.Open New Account");
            System.out.println("2.Close New Account");
            System.out.println("3.Login Account");
            System.out.println("0.Exit");
            op=sc.nextInt();
            if(op==1)
            {
                int op1=0;
                System.out.println("1.Savings Account");
                System.out.println("2.Current Account");
                op1=sc.nextInt();
                String name;
                String address;
                String phNO;
                String accNo;
                String Date;

                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                Date=dtf.format(now);
                sc.nextLine();
                System.out.println("Enter Name: ");
                name=sc.nextLine();
                System.out.println("Enter Address: ");
                address=sc.nextLine();
                System.out.println("Enter Phone Number: ");
                phNO=sc.nextLine();
                accNo=String.valueOf(account);
                account++;
                if(op1==1)
                {
                    accounts.add(new Savings(name,address,phNO,accNo,Date));
                }
                else
                {
                    accounts.add(new checking(name,address,phNO,accNo,Date));
                }

            }

        }

    }


}