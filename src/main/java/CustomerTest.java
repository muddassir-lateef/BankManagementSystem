import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @org.junit.jupiter.api.Test
    void creationtest() {
        Customer c=new Customer(1);
        Assert.assertEquals(c.opensaving("1","1","1","1","1"),true);
        Assert.assertEquals(c.openchecking("1","1","1","1","1"),true);

    }


}
