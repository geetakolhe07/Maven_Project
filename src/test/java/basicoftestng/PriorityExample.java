package basicoftestng;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 1)
    public void testCaseA(){
        System.out.println("test case A");
    }

    @Test(groups = {"smoke"})
    public void testCaseO(){
        System.out.println("test case O");
    }

    @Test(priority = 2)
    public void testCaseG(){
        System.out.println("test case G");
    }

    @Test(priority = 'b')
    public void testCaseT(){
        System.out.println("test case T");
    }

    @Test
    public void testCaseR(){
        System.out.println("test case R");
    }

    @Test(priority = -6)
    public void testCaseB(){
        System.out.println("test case B");
    }

    @Test
    public void testCaseV(){
        System.out.println("test case V");
    }
}
