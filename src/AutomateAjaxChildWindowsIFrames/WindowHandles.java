package AutomateAjaxChildWindowsIFrames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String>it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		
		System.out.println(driver.findElement(By.cssSelector(".im-para")).getText());
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		String email = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at ")[1].split(" ")[0].trim().split(" ")[0];

		driver.switchTo().window(parentId);
		
		driver.findElement(By.id("username")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("terms")).click();
		
		
	}
}
