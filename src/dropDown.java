import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		WebElement element = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		
		Select dropdownCurrency = new Select(element);
		
		dropdownCurrency.selectByIndex(3);
		System.out.println(dropdownCurrency.getFirstSelectedOption().getText());
		
		dropdownCurrency.selectByVisibleText("AED");
		System.out.println(dropdownCurrency.getFirstSelectedOption().getText());
		
		dropdownCurrency.selectByValue("INR");
		System.out.println(dropdownCurrency.getFirstSelectedOption().getText());
		
	}

}
