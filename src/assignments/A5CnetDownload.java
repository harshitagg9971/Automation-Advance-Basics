package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A5CnetDownload {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","G:/selenium files/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://download.cnet.com");
		WebElement download =  driver.findElement(By.xpath("//a[@class='brand brand-text']//img[@class='logo']"));
		Actions act = new Actions(driver);
		act.moveToElement(download).perform();
		Thread.sleep(5000);
		WebDriverWait wait =  new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Windows')]")));
		WebElement windows = driver.findElement(By.xpath("//span[contains(text(),'Windows')]"));
		act.moveToElement(windows).perform();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='quick-links-list']//a[contains(text(),'Most Popular')]")));
		WebElement mostpopular = driver.findElement(By.xpath("(//div[@class='quick-links-list']//a[contains(text(),'Most Popular')]"));
		System.out.println("okkkkkkkkkkkkkkk");
		//act.moveToElement(mostpopular).perform();
		//act.click(mostpopular).perform();
		mostpopular.click();
	}

}
