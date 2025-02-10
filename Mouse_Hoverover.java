package practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hoverover 
{

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		WebElement e1= driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		
		Actions e2= new Actions(driver);
		e2.moveToElement(e1).perform();
		
		WebElement product= driver.findElement(By.linkText("Men's Kurtas"));
		product.click();
	}

}
