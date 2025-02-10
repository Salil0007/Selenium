package practice_selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DDT_Excel {

	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream file1= new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Basic\\ExcleSheet\\Salil.xlsx");
		
		Workbook w1= WorkbookFactory.create(file1);
		//user name is alpha characters
//		String username= w1.getSheet(https://marketplace.eclipse.org/marketplace-client-intro?mpc_install=1549"login").getRow(1).getCell(0).getStringCellValue();
//		String password= w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		
		//numeric value use
		String username1= NumberToTextConverter.toText(w1.getSheet("login").getRow(2).getCell(0).getNumericCellValue());
		String password= w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		
		System.out.println();
		System.out.println(password);
		
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:/www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement un = driver.findElement(By.id("email"));
		un.sendKeys(username1);
		
		WebElement pw = driver.findElement(By.id("pass"));
		pw.sendKeys(password);
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		TakesScreenshot t1= driver;
		File f1=  t1.getScreenshotAs(OutputType.FILE);
		
		File f2= new File("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Basic\\Screenshot\\login"+ Math.random()+".png");
		
		FileHandler.copy(f1, f2);
		
		
	}

}
