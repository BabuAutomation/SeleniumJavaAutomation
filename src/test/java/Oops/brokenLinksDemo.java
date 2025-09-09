package Oops;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinksDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://bstackdemo.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement link:links) {
			String url=link.getAttribute("href");
			try {
				HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
				conn.connect();
				if(conn.getResponseCode()>=400) {
					System.out.println(url + "Broken link");
				}
				else {
					System.out.println(url + "Valid link");
				}
				
			}catch (Exception e) {
				System.out.println(url + "Error:" + e.getMessage());
			}
		}
		driver.quit();
		
		}
	}


