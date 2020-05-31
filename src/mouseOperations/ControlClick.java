package mouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ControlClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","G:/selenium files/geckodriver-v0.26.0-win64/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement forgotPassword = driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
		Actions  act = new Actions(driver);
		//act.keyDown(Keys.LEFT_CONTROL).click(forgotPassword).perform();
		//act.sendKeys(Keys.LEFT_CONTROL).click(forgotPassword).perform();
		act.keyDown(Keys.LEFT_CONTROL).click(forgotPassword).perform();
	}

}
