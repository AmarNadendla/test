package Library;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.IAnnotationTransformer;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class ListenerClass  implements IAnnotationTransformer
{
	@Override
	public void transform(ITestAnnotation iAno, Class testClass, Constructor testConstructor, Method method) 
	{
		if(FrameWorkLibrary.getExecuteStatus(method.getName()))
		{
			int priority = FrameWorkLibrary.getPriority(method.getName());
			String Description = FrameWorkLibrary.getDescription(method.getName());
			
			iAno.setEnabled(true);
			iAno.setPriority(priority);
			iAno.setDescription(Description);
		}
		else
		{
			iAno.setEnabled(false);
		}
	}
}
