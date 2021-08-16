package AllAboutTestNG;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AlwaysRunTest {
	
	@Test
    public void testCase2(){
        System.out.println("in test case 2");
        Assert.assertEquals(1,2); 
    }

    @Test(dependsOnMethods = { "testCase2" })
    public void testcase3(){
        System.out.println("testcase 3");
        Assert.assertEquals(1,1);
    }
	/*
	 * @Test() public void atestcase4(){ System.out.println("atestcase4");
	 * Assert.assertEquals(1,2); }
	 */

    @AfterMethod(alwaysRun = true)
    public void afterMethod2() {
        System.out.println("in afterMethod2");
    }
    @AfterMethod(alwaysRun = true)
    public void afterMethod3() {
        System.out.println("in afterMethod3");
    }

}
