package practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class java_scipt_popup
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup");
		driver.manage().window().maximize();
		
		WebElement popup= driver.findElement(By.xpath("//button[@class='btnjs']"));
		popup.click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		

	}

}
