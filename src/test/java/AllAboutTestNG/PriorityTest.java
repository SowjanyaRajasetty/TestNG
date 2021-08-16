package AllAboutTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority=0)
    public void testCase2(){
        System.out.println("in test case 2");
        Assert.assertEquals(1,1); 
    }

    @Test(priority=0)
    public void testcase3(){
    	
        System.out.println("testcase 3");
        Assert.assertEquals(1,1);
    }
}
