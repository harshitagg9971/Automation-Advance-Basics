package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A2 {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","G:/selenium files/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(3000);
		WebDriverWait wait =  new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='addTasksImg']")));
		driver.findElement(By.xpath("//div[@class='addTasksImg']")).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']//div[@class='dropdownButton']")));
		driver.findElement(By.xpath("//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']//div[@class='dropdownButton']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Big Bang Company']")));
		driver.findElement(By.xpath("//div[text()='Big Bang Company']")).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'comboboxButton focused')]//div[contains(@class,'dropdownButton')]")));
		driver.findElement(By.xpath("//div[contains(@class,'comboboxButton focused')]//div[contains(@class,'dropdownButton')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'- New Project -')]")).click();
	}

}
