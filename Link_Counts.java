package practice_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Counts {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.google.com");
		
		List <WebElement> e1= driver.findElements(By.tagName("a"));
		int count = e1.size();
		System.out.println(count); 
		
		for (int i=0; i<count; i++)
		{
			WebElement links= e1.get(i);
			String message= links.getAttribute("href");
			System.out.println(message);
		}
		
		
	}

}
