import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyFirstProg {

	public static void main(StringJava[] args) {
		// TODO Auto-generated method stub
		//Invoking browsers
		//ChromeDriver is class ->method ->A WebDriver implementation that controls a Chrome browser running on the local machine.It 			requires a chromedriver executable to be available in PATH.
		//method name will be same
		//chromedriver.exe -> to invoke the chrome browser
		//step to invoke chrome Browsers
		//selenium Manager - Selenium Manager is a command-line tool implemented in Rust that provides automated driver and browser 		//management for Selenium. Selenium bindings use this tool by default, so you do not need to download it or add anything to 		your code or do anything else to use it
		System.setProperty("webdriver.chrome.driver","D:\\SHWETA\\SELENIUM\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// to access the chrome browser 
		driver.get("https://github.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		driver.close();//Close the current window, quitting the browser if it's the last window currently open.
		driver.quit();//Quits this driver, closing every associated window.
	}

}
