package Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



import org.openqa.selenium.remote.Augmenter;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FrameWorkLibrary extends Logger
{
	
	public static int getNumOfTimesTCtoRun(String mthName) throws IOException
	{
		//String tcDdescription=null;
		
		XSSFWorkbook wrk;
		XSSFSheet shet;
		XSSFRow rww;
		XSSFCell cll;
		
		File fi=new File("TestData.xlsx");
		FileInputStream fin=new FileInputStream(fi);
		
		wrk=new XSSFWorkbook(fin);
		shet=wrk.getSheet("TestData");
		
		
		//int no_of_rows=shet.getLastRowNum();
		rww=shet.getRow(1);
		//int no_of_cols=rww.getLastCellNum();
		
		int count=0;
		
		for(int i=0;i<=shet.getLastRowNum();i++)
			
		{
			rww=shet.getRow(i+1);
			if(rww==null)
			continue;
			cll=rww.getCell(1);
			//.setCellType(Cell.CELL_TYPE_STRING)
	        if(cll.getStringCellValue().equals(mthName))
			{
				count=count+1;
				
			}
			
		}
		
		wrk.close();
		fin.close();
		
		return count;
		
	}
	
	
	public static String getIterationType(String mthName) throws IOException
	{
		String Iterationtype=null;
		
		XSSFWorkbook wrk;
		XSSFSheet shet;
		XSSFRow rww;
		XSSFCell cll;
		
		File fi=new File("RunManager.xlsx");
		FileInputStream fin=new FileInputStream(fi);
		
		wrk=new XSSFWorkbook(fin);
		shet=wrk.getSheet("Main");
		
		
		//int no_of_rows=shet.getLastRowNum();
		rww=shet.getRow(1);
		//int no_of_cols=rww.getLastCellNum();
		
		for(int i=0;i<=shet.getLastRowNum();i++)
			
		{
			rww=shet.getRow(i+1);
			if(rww==null)
			break;
			cll=rww.getCell(1);
			System.out.println("Method Name: "+cll.getStringCellValue());
			if(cll.getStringCellValue().equals(mthName))
			{
				cll=rww.getCell(5);
				System.out.println("Iterationtype:"+cll.getStringCellValue());
				Iterationtype = cll.getStringCellValue();
				
			}
			
		}
		
		wrk.close();
		fin.close();
		
		return Iterationtype;
		
	}
	public static String getTestCases()
	{
		String ExcelTestCasesName = "";
		try
		{
			//Access to RunManager.xls file
			File f1 = new File("RunManager.xlsx");
			//Create File Input Steam Object
			FileInputStream fis = new FileInputStream(f1);
			//Create Workbook Object
			XSSFWorkbook wb1 = new XSSFWorkbook(fis);
			//Create Worksheet Object
			XSSFSheet ws1 = wb1.getSheet("Main");
			//get Row count
			int rowcount = ws1.getLastRowNum();
			//Iterate Through all rows and get the testcases which are set to true.
			for(int j = 1;j<=rowcount;j++)
			{
				Cell cell = ws1.getRow(j).getCell(3);
				if(cell.getStringCellValue().toLowerCase().trim().equalsIgnoreCase("true".toLowerCase().trim()))
				{
					Cell cell1 = ws1.getRow(j).getCell(0);
					ExcelTestCasesName = ExcelTestCasesName + ";;" + cell1.getStringCellValue();
				}
			}
			//close workbook
			wb1.close();
			//close input stream
			fis.close();
		}
		catch(Exception e)
		{
			
		}
		return ExcelTestCasesName;
	}
	
	public static String getData(String FieldName)
	{
		String StrValue = "";
		try
		{
			StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
			StackTraceElement stackTraceElement = stackTraceElements[2];
			String methodName = stackTraceElement.getMethodName();
			System.out.println(methodName);
			File fi=new File("TestData.xlsx");
			FileInputStream fin=new FileInputStream(fi);
			
			XSSFWorkbook wrk=new XSSFWorkbook(fin);
			XSSFSheet	shet=wrk.getSheet("TestData");
			
			Row rw=shet.getRow(1);
			
			for(int i=0;i<=shet.getLastRowNum();i++)
			{
				rw=shet.getRow(i+1);
				if(rw==null || rw.getCell(0)==null)
				continue;
	
				String TestCaseName =rw.getCell(0).getStringCellValue();
				if(TestCaseName.equals(methodName))
				{
					for(int j=1;j<rw.getLastCellNum();j++)
					{
						Cell cl=rw.getCell(j);
						if(cl==null)
						continue;
						String val=cl.getStringCellValue();
						String arrval[] = val.split(":=");
						
						String StrFieldName = arrval[0];
						if(StrFieldName.equalsIgnoreCase(FieldName))
						{
							StrValue = arrval[1];
							break;
						}
					}
				}				
			}
			
			wrk.close();
			fin.close();
		}
		catch(Exception e)
		{
			
		}
		return StrValue;
	}
	
	public static String getData(String FieldName,int iterationNumber)
	{
		String StrValue = "";
		int iterationValue = 0;
		System.out.println("***********************FROM GET DATA "+iterationNumber+"************************");
		try
		{
			StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
			StackTraceElement stackTraceElement = stackTraceElements[2];
			String methodName = stackTraceElement.getMethodName();
			System.out.println(methodName);
			File fi=new File("TestData.xlsx");
			FileInputStream fin=new FileInputStream(fi);
			
			XSSFWorkbook wrk=new XSSFWorkbook(fin);
			XSSFSheet	shet=wrk.getSheet("TestData");
			
			Row rw=shet.getRow(1);
			
			for(int i=0;i<=shet.getLastRowNum();i++)
			{
				rw=shet.getRow(i+1);
				if(rw==null || rw.getCell(0)==null)
				continue;
	
				String TestCaseName =rw.getCell(0).getStringCellValue();
				if(TestCaseName.equals(methodName))
				{
					for(int j=1;j<rw.getLastCellNum();j++)
					{
						Cell cl=rw.getCell(j);
						if(cl==null)
						continue;
						String val=cl.getStringCellValue();
						String arrval[] = val.split(":=");
						
						String StrFieldName = arrval[0];
						if(StrFieldName.equalsIgnoreCase("Iteration")){
							iterationValue = Integer.parseInt(arrval[1]);
						}
						if(StrFieldName.equalsIgnoreCase(FieldName))
						{
							StrValue = arrval[1];
							break;
						}
					}
					if(iterationNumber == iterationValue){
						break;
					}
				}	
			}
			
			wrk.close();
			fin.close();
		}
		catch(Exception e)
		{
			
		}
		return StrValue;
	}
	
	
	public static boolean getExecuteStatus(String mthName)
	{
		boolean flag=false;
		
		try
		{
			XSSFWorkbook wrk;
			XSSFSheet shet;
			XSSFRow rww;
			XSSFCell cll;
			
			File fi=new File("RunManager.xlsx");
			FileInputStream fin=new FileInputStream(fi);
			
			wrk=new XSSFWorkbook(fin);
			shet=wrk.getSheet("Main");
			
			rww=shet.getRow(1);
			for(int i=0;i<=shet.getLastRowNum();i++)
			{
				rww=shet.getRow(i+1);
				if(rww==null || rww.getCell(0)==null )
				continue;
				cll=rww.getCell(1);
				if(cll.getStringCellValue().equals(mthName))
				{
					cll=rww.getCell(3);
					String result=cll.getStringCellValue();
					flag=Boolean.parseBoolean(result);
				}
				
			}
			wrk.close();
			fin.close();
		}
		catch(Exception e)
		{
			
		}
		return flag;
	}
	
	public static int getPriority(String mthName)
	{
		int priority=0;
		
		try
		{
			XSSFWorkbook wrk;
			XSSFSheet shet;
			XSSFRow rww;
			XSSFCell cll;
			
			File fi=new File("RunManager.xlsx");
			FileInputStream fin=new FileInputStream(fi);
			
			wrk=new XSSFWorkbook(fin);
			shet=wrk.getSheet("Main");
			rww=shet.getRow(1);
			for(int i=0;i<=shet.getLastRowNum();i++)
				
			{
				rww=shet.getRow(i+1);
				if(rww==null || rww.getCell(4)==null)
				continue;
				cll=rww.getCell(1);
				if(cll.getStringCellValue().equals(mthName))
				{
					cll=rww.getCell(4);
					String result=cll.getStringCellValue();
					priority=Integer.parseInt(result);
				}
			}
			
			wrk.close();
			fin.close();
		}
		catch(Exception e)
		{
			
		}
		return priority;
		
	}
	
	public static String getDescription(String mthName)

	{
		String tcDdescription=null;
		
		try
		{
			XSSFWorkbook wrk;
			XSSFSheet shet;
			XSSFRow rww;
			XSSFCell cll;
			
			File fi=new File("RunManager.xlsx");
			FileInputStream fin=new FileInputStream(fi);
			
			wrk=new XSSFWorkbook(fin);
			shet=wrk.getSheet("Main");
			
			rww=shet.getRow(1);
			
			for(int i=0;i<=shet.getLastRowNum();i++)
				
			{
				rww=shet.getRow(i+1);
				if(rww==null || rww.getCell(2)==null)
				continue;
				cll=rww.getCell(1);
				if(cll.getStringCellValue().equals(mthName))
				{
					cll=rww.getCell(2);
					 tcDdescription=cll.getStringCellValue();
					
				}
				
			}
			
			wrk.close();
			fin.close();
		}
		catch(Exception e)
		{
			
		}
		
		return tcDdescription;
		
	}
	
	public static String createresultsfolder() 
	{
		DateFormat dateTimeInstance = SimpleDateFormat.getDateTimeInstance();
	    String DateTimeStamp = dateTimeInstance.format(Calendar.getInstance().getTime());
	    DateTimeStamp = DateTimeStamp.replace(",", "");
	    DateTimeStamp = DateTimeStamp.replace(" ", "_");
	    DateTimeStamp = DateTimeStamp.replace(":", "-");
		File dir = new File(ResultsFolderPath + DateTimeStamp);
		dir.mkdir();
		return ResultsFolderPath + DateTimeStamp;
	}

	
}

class Globalvariables
{
	public static String RunManagerName = "RunManager.xlsx";
	public static String MainMethodName  = "testdefinition";
	public static String testdatapath = "TestData\\TestData.xlsx";
	public static String TestDataSheetName = "TestData";
	public static String CurrentTestCase = "";
	public static String ScreenshotsFolderPath = "";
	public static String ResultsFolderPath;
	public static String CurrentResultsFolderPath;
	public static String ResultFilePath;
	public static String CurrentDirectory;
	public static String TestDataPath;
	public static ExtentReports report;
	public static ExtentTest logger ;
	public static WebDriver driver;
	public static String ClassPath;
	public static int StartIteration;
	public static int EndIteration;
	public static int CurrentIteration;
	public static String plog = "";
	public static String flog = "";
	public static boolean takescreenshotforlogger = false;
	public static boolean takescreenshotForpassstatements = false;
	public static boolean takescreenshotForFailStatements = false;
	public static boolean Highlightelement = false;
	public static Map<String, String> tdmap = new HashMap<>();
	public static boolean isResultsLogged = false;
	public static boolean TestDataUsed = false;
	public static String ts;

}

class Logger extends Globalvariables
{
	public static String takescreenshot(WebDriver driver) throws IOException, InterruptedException
	
	{
		Thread.sleep(3000);
		System.out.println("TakeScreenShot Method called");
		DateFormat dateTimeInstance = SimpleDateFormat.getDateTimeInstance();
		String DateTimeStamp = dateTimeInstance.format(Calendar.getInstance().getTime());
		DateTimeStamp = DateTimeStamp.replace(",", "");
		DateTimeStamp = DateTimeStamp.replace(" ", "_");
		DateTimeStamp = DateTimeStamp.replace(":", "_");
		String ScreenshotName = "CurrentTestCase" + "_"+ DateTimeStamp;
		TakesScreenshot ts =(TakesScreenshot) driver;
		System.out.println("TakeScreenShot::"+ts);
		File source = ts.getScreenshotAs(OutputType.FILE);
		String Dest = CurrentResultsFolderPath + "\\ScreenShots\\" + ScreenshotName + ".png";
		
		System.out.println("Dest is::"+Dest);
		
		File destination = new File(Dest);
		FileUtils.copyFile(source, destination);
		return Dest;
		
	}
	
public static void updateLogStep(boolean stepStatus) throws IOException, InterruptedException
	{
	
	    if(stepStatus)
		{
	    	if(plog.length()>0)
	    	LogEvent("pass", plog);
	    	//LogEvent("pass", plog);
		}
		else
		{
			if(flog.length()>0)
			//LogEvent("fail", flog);
			LogEvent("fail", flog);
		}
		plog = "";
		flog= "";
	}
public  static void LogEvent(String Status,String Description) throws IOException, InterruptedException
{
	
	isResultsLogged = true;
	if (takescreenshotforlogger)
	{
		if(Status.equalsIgnoreCase("pass"))
		{
			if(takescreenshotForpassstatements)
			LogEventWithScreeshot(Status, Description);
		}
		else if(Status.equalsIgnoreCase("fail"))
		{
			if(takescreenshotForFailStatements)
			LogEventWithScreeshot(Status, Description);
		}
		return;
	}
	WebGeneralLibrary.wait(1);
	if(Status.equalsIgnoreCase("pass"))
	{
		logger.log(LogStatus.PASS,  Description);
		System.out.println("\t " +"StepStatus:" + Status + "; StepDesciption:" + Description);
	}
	else if(Status.equalsIgnoreCase("fail"))
	{
		logger.log(LogStatus.FAIL, Description);
		System.out.println("\t " +"StepStatus:" + Status + "; StepDesciption:" + Description);
	}
	else if (Status.equalsIgnoreCase("warning"))
	{
		logger.log(LogStatus.WARNING, Description);
		System.out.println("\t " +"StepStatus:" + Status + "; StepDesciption:" + Description);
	}
	else if(Status.equalsIgnoreCase("info"))
	{
		logger.log(LogStatus.INFO, Description);
		System.out.println("\t " +"StepStatus:" + Status + "; StepDesciption:" + Description);
	}
}
public static  void LogEventWithScreeshot(String Status,String Description) throws IOException, InterruptedException
{
	WebGeneralLibrary.wait(1);
	String ScreenShotPath = takescreenshot(driver);
	//getscreenshot(driver);
	//ScreenshotsFolderPath
	System.out.println("screen shot path "+ScreenShotPath);
	String scn = logger.addScreenCapture(ScreenShotPath);
	if(Status.equalsIgnoreCase("pass"))
	{
		logger.log(LogStatus.PASS, Description + scn);
		System.out.println("\t " +"StepStatus:" + Status + "; StepDesciption:" + Description);
	}
	else if(Status.equalsIgnoreCase("fail"))
	{
		logger.log(LogStatus.FAIL, Description + scn);
		System.out.println("\t " +"StepStatus:" + Status + "; StepDesciption:" + Description);
	}
	else if (Status.equalsIgnoreCase("warning"))
	{
		logger.log(LogStatus.WARNING, Description + scn);
		System.out.println("\t " +"StepStatus:" + Status + "; StepDesciption:" + Description);
	}
	else if(Status.equalsIgnoreCase("info"))
	{
		logger.log(LogStatus.INFO, Description + scn);
		System.out.println("\t " +"StepStatus:" + Status + "; StepDesciption:" + Description);
	}
}

/*public static String getscreenshot(WebDriver driver)
{
	  try
	  {
		String ScreenshotName;
		DateFormat dateTimeInstance = SimpleDateFormat.getDateTimeInstance();
		String DateTimeStamp = dateTimeInstance.format(Calendar.getInstance().getTime());
		DateTimeStamp = DateTimeStamp.replace(",", "");
		DateTimeStamp = DateTimeStamp.replace(" ", "_");
		DateTimeStamp = DateTimeStamp.replace(":", "_");
		ScreenshotName =  "CurrentTestCase" + "_"+ DateTimeStamp;
		
		System.out.println("ScrnShotName:"+ScreenshotName);
//		TakesScreenshot ts =(TakesScreenshot) driver;
//		System.out.println("Take screenShot:"+ts);
//		
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		String Dest = ScreenshotsFolderPath + ScreenshotName + ".png";
//		
//		System.out.println("Dest::"+Dest);
//		
//		File destination = new File(Dest);
//		FileUtils.copyFile(source, destination);
		TakesScreenshot ts =(TakesScreenshot) driver;
		System.out.println("Take screenShot:"+ts);
		File templocation = ts.getScreenshotAs(OutputType.FILE);
		String destination= "E:\\Tmasters\\ZIPFiles\\P4RC_TestNGFramework\\Results\\screenshots\\"+ScreenshotName;
		System.out.println("Dest::"+destination);
		File Dest = new File(destination);
		FileUtils.getFile(templocation, destination);
		return destination;
	  }
	  catch(Exception e)
	  {
		  return e.getMessage();
	  }
	
	
}*/


public static void enableTakingScreenshots()
{
	takescreenshotforlogger = true;
	takescreenshotForFailStatements = true;
	takescreenshotForpassstatements = true;
}
	
}
