package projectA;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumhq\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver, 60);
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'REGISTER')]")));
		driver.findElement(By.xpath("//*[contains(text(),'REGISTER')]")).click();
		WebElement e=driver.findElement(By.name("country"));
		Select s=new Select(e);
		s.selectByVisibleText("INDIA");
		List<WebElement> l=driver.findElements(By.name("country"));
		for(int i=0;i<l.size();i++) 
		{
			System.out.println(i);
		}
		

	}

}
