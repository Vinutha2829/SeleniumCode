package mavenTrainings;


import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

public class TestMethod {
	@Test(retryAnalyzer= mavenTrainings.Retry.class)
	public void test()
	{
		int c=1/0;
		System.out.println("HI");
	}
	@Test
	public void setup()
	{
		System.out.println("BYE");
	}
	

}
