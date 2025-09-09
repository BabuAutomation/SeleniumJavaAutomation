package Testng;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Annotationandpriority {
	
	WebDriver driver;
	
	@Test(priority=1)
	@Parameters({"Broswer"})
	void OpenApp(String PB)
	
	{
		if(PB.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(PB.equals("Edge"))
		{	
		driver=new EdgeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority=2, dependsOnMethods= {"OpenApp"})
	void Login()
	{
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("mngr632226");
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("zYgEhUj");
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		}
	
		
	@Test(priority=3, dependsOnMethods= {"Login"})
	void search()
	{
		System.out.println("Search");
	}
	
	@Test(priority=4)
	void CloseApp()
	{
		driver.close();
		
	}
	

}
