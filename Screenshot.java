package practice_selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Screenshot {

	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		WebElement e1= driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		
		Actions e2= new Actions(driver);
		e2.moveToElement(e1).perform();
		
		WebElement product= driver.findElement(By.linkText("Men's Kurtas"));
		product.click();
		
		TakesScreenshot ts= driver;
		File  f1= ts.getScreenshotAs(OutputType.FILE);
		
		//Random number screenshot
		//File f2= new File("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Basic\\Screenshot\\salil"+Math.random()+".png");
		
		//class name screenshot
		File f3= new File("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Basic\\Screenshot"+ new Screenshot().getClass()+".png");
		
		
		org.openqa.selenium.io.FileHandler.copy(f1, f3);
		

	}

}
