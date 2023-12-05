import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\SHWETA\\SELENIUM\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://github.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("login_field")).sendKeys("AquaShwe");
		driver.findElement(By.name("password")).sendKeys("Qwerty123");
		//driver.findElement(By.className("js-sign-in-button")).click();
		//driver.findElement(By.xpath("//a[@id='forgot-password']")).click();
		//driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();
		driver.findElement(By.name("email")).sendKeys("Asdajsajndk");
		driver.findElement(By.name("email")).clear();
		Assert.assertEquals(false, null);
		
				
	}

}
