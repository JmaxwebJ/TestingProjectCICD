
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AngularPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.findElement(By.name("name")).sendKeys("Vaibhav");
		driver.findElement(By.name("email")).sendKeys("vaibhav@mailinator.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Password123");
		driver.findElement(By.id("exampleCheck1")).click();

		WebElement staticDropDown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropDown = new Select(staticDropDown);
		dropDown.selectByIndex(0);

		driver.findElement(By.cssSelector("#inlineRadio2")).click();

		driver.findElement(By.name("bday")).sendKeys("11-11-1991");

		driver.findElement(By.cssSelector("input[class='btn btn-success']")).click();

		Thread.sleep(2000);

		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());

	}

}
