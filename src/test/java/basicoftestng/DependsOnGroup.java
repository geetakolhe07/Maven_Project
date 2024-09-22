package basicoftestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {

    @Test(groups = {"smoke"})
    public void verifyAddToCard(){
        Assert.assertTrue(false);
        System.out.println("Verify add to card");
    }

    @Test(dependsOnGroups = {"smoke"})
    public void verifyOrder(){
        System.out.println("Verify add to Order");
    }

    @Test
    public void verifyPayment(){
        System.out.println("Verify add to Payment");
    }
}
