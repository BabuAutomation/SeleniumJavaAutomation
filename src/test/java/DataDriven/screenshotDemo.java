package DataDriven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotDemo {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/java/index.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Full page
		TakesScreenshot TS=(TakesScreenshot)driver;
		File Fullpage=TS.getScreenshotAs(OutputType.FILE);
		File Pagetrgt=new File("C:\\Users\\DELL\\eclipse-workspace\\Techqflow1\\ScreenShots\\Fullpae.png");
		FileUtils.copyFile(Fullpage, Pagetrgt);
		
		// Specific element
		
		WebElement Java=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/img"));
		File javapage=Java.getScreenshotAs(OutputType.FILE);
		File pagetarget=new File("C:\\Users\\DELL\\eclipse-workspace\\Techqflow1\\ScreenShots\\javapage.png");
		FileUtils.copyFile(javapage, pagetarget);
		
	}

}
