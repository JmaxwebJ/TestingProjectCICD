import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Intro {

	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.chrome.driver", "D:/chromedriverversion124/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		cr.addArguments("--force-device-scale-factor=0.5");
		
		
		//Invoking Browser
		WebDriver driver = new ChromeDriver(cr);

		driver.get("https://rahulshettyacademy.com/");

		System.out.println(driver.getTitle());
		System.out.println();
		driver.getCurrentUrl();
		driver.quit();
		
	}

}
