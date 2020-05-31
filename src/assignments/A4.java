package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","G:/selenium files/geckodriver-v0.26.0-win64/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@class,'title ellipsis')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'item createNewCustomer')]")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//div[contains(@class,'customerNameDiv')]//input[contains(@placeholder,'Enter Customer Name')]")).sendKeys("veera");
		driver.findElement(By.xpath("//textarea[contains(@placeholder,'Enter Customer Description')]")).sendKeys("name is veera thank you have a good day");
		driver.findElement(By.xpath("//div[contains(text(),'Create Customer')]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[contains(@class,'header')]//input[contains(@placeholder,'Start typing name ...')]")).sendKeys("veera");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[contains(@class,'innerContainer')]//div[1]//div[4]")).click();
		Thread.sleep(1400);
		driver.findElement(By.xpath("//div[contains(@class,'editCustomerPanelHeader')]//div[contains(@class,'action')][contains(text(),'ACTIONS')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'taskManagement_customerPanel')]//div[contains(@class,'title')][contains(text(),'Delete')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Delete permanently')]")).click();
	}

}
