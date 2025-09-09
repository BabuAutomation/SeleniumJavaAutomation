package Oops;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Staff {
		
	int ID;
	String Name;
	String Job;
	int Salary;
	
	Staff(int ID, String Name, String Job, int Salary)
	{
		this.ID=ID;
		this.Name=Name;
		this.Job=Job;
		this.Salary=Salary;
	}
	
	void display()
	{
		System.out.println(ID);
		System.out.println(Name);
		System.out.println(Job);
		System.out.println(Salary);
	}
	

	public static void main(String[] args)
	{
		
	Staff Stf1=new Staff(5, "Ravi", "Tester", 1000);
	
	Stf1.display();

	}

}

/*List<WebElement> links=driver.findElements(By.tagName("a"));

for(WebElement link: links)
{
	String url=link.getAttribute("href");
		
if(url != null) {
	try {
		
		HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
		conn.connect();
		if(conn.getResponseCode() >=400) 
		{
			System.out.println(url + "Broken link");
		}
		else
		{
			System.out.println(url + "Valid link");
		}
	} catch (Exception e) {
		System.out.println(url + "error:" + e.getMessage());
	}
	}

}
driver.quit();*/
