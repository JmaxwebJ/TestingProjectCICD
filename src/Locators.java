import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators extends ForgotPassword{

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

	//	WebDriverManager.firefoxdriver().setup();

//		WebDriverManager.edgedriver().setup();
		
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(cr);
//		WebDriver driver = new FirefoxDriver();
		
//		WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String passwordA= passwordB(driver);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
//		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
//		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
//		driver.findElement(By.className("submit")).click();
//		
//		System.out.println(driver.findElement(By.cssSelector("[class='error']")).getText());
//		
//		driver.findElement(By.linkText("Forgot your password?")).click();
//		
//		driver.findElement(By.xpath("//form/input[1]")).sendKeys("Rahul");
//		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rahul@mailinator.com");
//		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("1234567890");
//		driver.findElement(By.className("reset-pwd-btn")).click();
//		
//		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
//		
//		driver.findElement(By.className("go-to-login-btn")).click();
//		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).clear();
		driver.findElement(By.name("inputPassword")).sendKeys(passwordA);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		//Thread.sleep(1000);  Need to put explicit wait
		
		System.out.println(driver.findElement(By.tagName("p")).getText()); 
		//driver.findElement(By.cssSelector(".logout-btn")).click();
		
//		driver.close();
//		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
	}

}
