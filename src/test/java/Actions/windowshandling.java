package Actions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandling {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"wikipedia-search-result-link\"]/a")).click();
		driver.findElement(By.linkText("Selenium in biology")).click();
		
		Set<String> WinID=driver.getWindowHandles();
		for(String Win:WinID) {
			String title=driver.switchTo().window(Win).getTitle();
			if(title.equals("Selenium in biology - Wikipedia")) {
				driver.findElement(By.xpath("//*[@id=\"ca-talk\"]/a/span")).click();
			}
			if(title.equals("Selenium - Wikipedia")) {
				driver.findElement(By.xpath("//*[@id=\"p-lang-btn-checkbox\"]")).click();
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/ul[2]/li[5]")).click();
			}
		}
		
	}

}
