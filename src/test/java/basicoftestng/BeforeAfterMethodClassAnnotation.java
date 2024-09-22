package basicoftestng;

import org.testng.annotations.*;

public class BeforeAfterMethodClassAnnotation {

    @BeforeClass
    public void beforeClassExample(){
        System.out.println("Before class Example");
    }

    @AfterClass
    public void afterClassExample(){
        System.out.println("After class Example");
    }

    @BeforeMethod
    public void beforeMethodDemo(){
        System.out.println("Before Method Demo.....");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method Demo.....");
    }

    @Test(enabled = false)
    public void verifyMethod_1(){
        System.out.println("Verify Method 1");
    }

    @Test(groups = {"smoke"})
    public void verifyMethod_2(){
        System.out.println("Verify Method 2");
    }

    @Test
    public void verifyMethod_3(){
        System.out.println("Verify Method 3");
    }


}
