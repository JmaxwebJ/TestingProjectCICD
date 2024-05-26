import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForgotPassword {

	public static String passwordB (WebDriver driver){
		
//		WebDriverManager.chromedriver().setup();
//		
//		ChromeOptions cr = new ChromeOptions();
//		cr.addArguments("--remote-allow-origins=*");
//		
//		WebDriver driver = new ChromeDriver(cr);
//		
//		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		String passwordText = driver.findElement(By.cssSelector(".infoMsg")).getText();
		
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray = passwordText.split("'");
		String password1 = passwordArray[1].split("'")[0];
		//0th index - Please use temporary password 
		//1st index - rahulshettyacademy' to Login.
		
		//0th index - rahulshettyacademy
		//1st index	-  to Login
		System.out.println(password1+"vaibhav");
		return password1;
		
	}

}
