package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act= new Actions(driver);
		
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
		
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		act.dragAndDrop(drag, drop).build().perform();

	}

}
