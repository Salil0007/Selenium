package practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		WebElement  fileupload= driver.findElement(By.id("file"));
		fileupload.sendKeys("C:\\Users\\ADMIN\\Use live layout and alignment guides.pdf");

	}

}
