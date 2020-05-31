package mouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","G:/selenium files/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		WebElement essential = driver.findElement(By.xpath("//a[contains(text(),'Essentials')]"));
		Actions  act = new Actions(driver);
		act.moveToElement(essential).perform();	
		Thread.sleep(5000);
		WebElement hairstyling = driver.findElement(By.xpath("//a[contains(text(),'Hair Styling')]"));
		act.moveToElement(hairstyling).click(hairstyling).perform();
	}
}
