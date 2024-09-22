package basicoftestng;

import org.testng.annotations.Test;

public class InvocationCountAttribute {

    @Test(invocationCount = 100, invocationTimeOut = 1,groups = {"smoke"})
    public void verifyInvocationCount(){
        System.out.println("Happy New year.....");
    }
}
