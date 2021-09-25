import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getAccNumtest() {
        Account a=new Account("1","1","1","1","1");
        Assert.assertEquals(a.getAccNum(),"1");

    }

    @Test
    void makeDepositandcheckbalance() {
        Account a=new Account("1","1","1","1","1");
        a.makeDeposit(100,"1","1");

        Assert.assertEquals(a.checkBalance(),100);

    }


    @Test
    void makeWithdrawaltest() {
        Account a=new Account("1","1","1","1","1");
        Assert.assertEquals(a.makeWithdrawal(100,1),false);
    }

}