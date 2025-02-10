package practice_selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links {

	public static void main(String[] args) throws IOException 
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
			brokenlinks(message); 
		}
}
	
	static void brokenlinks(String message) throws IOException 
	{
		URL u1 = new URL(message);
		HttpURLConnection u2= (HttpURLConnection)  u1.openConnection();
		if (u2.getResponseCode()==200)
		{
			System.out.println("link is valid");
			System.out.println(u2.getResponseMessage());
		}
		else
		{
			System.out.println("link is not valid");
		} 
		
				
				
	}

}
