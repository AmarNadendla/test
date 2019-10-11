package Library;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.IAnnotationTransformer;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;




public  class ListenerClass  implements IAnnotationTransformer,ITestListener,IInvokedMethodListener
{
	
	String type;
	
	public void transform(ITestAnnotation iAno, Class testClass, Constructor testConstructor, Method method) 
	{
		if(FrameWorkLibrary.getExecuteStatus(method.getName()))
		{
			int priority = FrameWorkLibrary.getPriority(method.getName());
			String Description = FrameWorkLibrary.getDescription(method.getName());
			System.out.println("Description is:::"+Description);
			
			
			
			
			iAno.setEnabled(true);
			iAno.setPriority(priority);
			iAno.setDescription(Description);
			
			try {
				type=FrameWorkLibrary.getIterationType(method.getName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(method.getName()+"Type =====> "+type);
			
			switch(type)
			{
			case "No Test Data":
			iAno.setInvocationCount(1);
			break;
			
			case "Run only 1 Iteration":
			iAno.setInvocationCount(1);
			break;
			
			case "Run All Iterations":
				int runTimes = 0;
				try {
					runTimes = FrameWorkLibrary.getNumOfTimesTCtoRun(method.getName());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			System.out.println(method.getName() + " will run for ====> "+runTimes + "  times");
			iAno.setInvocationCount(runTimes);
			break;
				
			case "Run Range of Iterations":
			break;
							
			}
			//iAno.setInvocationCount(2);
		}
		
		
		
		else
		{
			iAno.setEnabled(false);
		}
		
		
	    
	}
	
	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult arg1) 
	{
		System.out.println("after invocation " + method.getTestMethod().getMethodName());
		
	}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult arg1) 
	{
	int iteration;
		
		Globalvariables.CurrentTestCase=method.getTestMethod().getMethodName()+"_1";
				
		if(!(method.getTestMethod().getMethodName().endsWith("TC")) )
		{
			if(!type.equals("No Test Data")){
			iteration=method.getTestMethod().getCurrentInvocationCount();
			FrameWorkLibrary.getData(method.getTestMethod().getMethodName(),(iteration+1));
			Globalvariables.CurrentTestCase=method.getTestMethod().getMethodName()+"_"+(iteration+1);
			//System.out.println(GlobalVariables.currentTestCaseName+" ===> is going to be executed");
			}
		}
		else
		{
			Globalvariables.CurrentTestCase=method.getTestMethod().getMethodName()+"_1";
			//System.out.println(GlobalVariables.currentTestCaseName+" ===> is going to be executed");
			
		}
       
    }
		

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
}
