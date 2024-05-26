

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPracticeLogin {

	public static void main(String[] args) {
	//	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
//		driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
//		driver.findElement(By.xpath("//header/div/button/parent::div/parent::header/a[2]")).getText();
	}

}
