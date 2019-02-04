package javapro;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Test094 
{

	public static void main(String[] args) throws Exception 
	{
		ExtentReports er=new ExtentReports("Gmailtest2.html",false);
		ExtentTest et=er.startTest("Gmail testing");
		
		System.setProperty("webdriver.chrome.driver", "c:\\seleniumhq\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		
		
		WebDriverWait w=new WebDriverWait(driver,60);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		
		String s=driver.getTitle();
		
		if(s.equals("Google")) 
		{
			String fname=screenshot(driver);
			et.log(LogStatus.PASS, "Gmail title Test passed", et.addScreenCapture(fname));
		}
		else
		{
			String fname=screenshot(driver);
			et.log(LogStatus.FAIL, "Gmail title Test Failed", et.addScreenCapture(fname));			
			
		}
		driver.close();
		er.endTest(et);
		er.flush();		
	}
	public static String screenshot(ChromeDriver driver) throws Exception
	{
		SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
		Date d=new Date();
		String fname=sf.format(d)+".jpg";
		File src=driver.getScreenshotAs(OutputType.FILE);
		File desc=new File(fname);
		FileHandler.copy(src, desc);
		return(fname);
		
	}
}
