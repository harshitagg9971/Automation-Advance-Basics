package mouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHoldAndRelease {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement forgotPassword = driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
		Actions  act = new Actions(driver);
		act.clickAndHold(forgotPassword).perform();
		Thread.sleep(3000);
		act.release(forgotPassword).perform();

	}

}
