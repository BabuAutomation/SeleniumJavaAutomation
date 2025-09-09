package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) {
		
		WebDriver driver= new EdgeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
				
		
		Actions act= new Actions(driver);
		
		WebElement link=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		
		act.doubleClick(link).perform();
		driver.switchTo().alert().accept();
		
		driver.quit();
		

		

	}

}
