package mavenTrainings;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry  implements IRetryAnalyzer{
		int count=0;
		int maxLimit=3;
	@Override
	public boolean retry(ITestResult result) {
		if(!result.isSuccess())
		{
			if(count>maxLimit)
			{
				count++;
				result.setStatus(ITestResult.FAILURE);
				return true;
			}
			else
			{
				result.setStatus(ITestResult.FAILURE);
			}
		}
		else
		{
			result.setStatus(ITestResult.SUCCESS);
		}
		return false;
		
	}

}
