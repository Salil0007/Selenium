package practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/dropdown/");
		
		WebElement e1= driver.findElement(By.id("Choice1"));
		e1.click();
		
		
		Select s1= new Select(e1);
		s1.selectByIndex(5);
		

	}

}
