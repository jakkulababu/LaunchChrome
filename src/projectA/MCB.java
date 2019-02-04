package projectA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MCB {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumhq\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://corp5.myclassboard.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("UserName")).sendKeys("p_16DAL010382");
		driver.findElement(By.id("Password")).sendKeys("Babu@1234");
		
		boolean b=driver.findElement(By.xpath("//*[contains(text(),'Remember me')]")).isSelected();
		if(b==false)
		{			
			
		}
		else
		{
			driver.findElement(By.xpath("//*[contains(text(),'Remember me')]")).click();
		}
		
		driver.findElement(By.id("LogID")).click();
	}

}
