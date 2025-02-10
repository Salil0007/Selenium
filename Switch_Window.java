package practice_selenium;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_Window {

	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		

       WebElement samsung=	driver.findElement(By.name("q"));
		samsung.sendKeys("samsung"+Keys.ENTER);
		
		WebElement product=	driver.findElement(By.xpath("(//div[@class='cPHDOP col-12-12'])[2]"));
		product.click();
		
		String p1= driver.getWindowHandle();
		System.out.println(p1);
		
		Set <String> c1= driver.getWindowHandles();
		System.out.println(c1);
		
		Iterator <String> ids=c1.iterator();
		
		String id1= ids.next();
		String id2= ids.next();
		System.out.println(id1);
		System.out.println(id2);
		
		driver.switchTo().window(id2);
		
		WebElement buy=	driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ _3Yl67G _7Pd1Fp']"));
		buy.click();
		
		
		
	}

}
