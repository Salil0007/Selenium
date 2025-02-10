package practice_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Autosuggestion {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		

       WebElement samsung=	driver.findElement(By.name("q"));
		samsung.sendKeys("samsung");
		
		Thread.sleep(3000);
		
		List <WebElement> selectproduct=  driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		selectproduct.get(4).click();
	}

}
