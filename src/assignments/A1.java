package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","G:/selenium files/geckodriver-v0.26.0-win64/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait =  new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='addTasksImg']")));
		driver.findElement(By.xpath("//div[@class='addTasksImg']")).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']//div[@class='dropdownButton']")));
		driver.findElement(By.xpath("//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']//div[@class='dropdownButton']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'- New Customer -')]")));
		driver.findElement(By.xpath("//div[contains(text(),'- New Customer -')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Customer Name']")).sendKeys("Harshit Aggarwal");
		driver.findElement(By.xpath("//input[@placeholder='Enter Project Name']")).sendKeys("Automation Work");
		driver.findElement(By.xpath("//div[@class='tablePlaceholder']//tr[1]//td[1]//input[1]")).sendKeys("harshit's work");
		driver.findElement(By.xpath("//body[contains(@class,'ext-chrome')]/div[@id='createTasksPopup']/div[@id='createTasksPopup_content']/div[contains(@class,'scrollableContainer')]/div[contains(@class,'contentWrapper')]/div[@class='innerContent']/div[@class='tablePlaceholder']/div[@class='taskTable']/div[@class='taskTableContainer']/table[@class='createTasksTable hideAddToTT']/tbody/tr[1]/td[5]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//tr[1]//td[5]//div[1]//div[1]//div[1]//div[1]//div[1]//div[11]//div[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Create Tasks')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),\"harshit's work\")]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'ACTIONS')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Delete')]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[contains(@class,'submitTitle buttonTitle')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'header')]//input[contains(@placeholder,'Start typing name ...')]")).sendKeys("Harshit Aggarwal");
		Thread.sleep(3500);
		driver.findElement(By.xpath("//span[text()='Harshit']/../../..//div[@class='editButton']")).click();
		Thread.sleep(2400);
		driver.findElement(By.xpath("//div[contains(@class,'editCustomerPanelHeader')]//div[contains(@class,'action')][contains(text(),'ACTIONS')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'taskManagement_customerPanel')]//div[contains(@class,'title')][contains(text(),'Delete')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Delete permanently')]")).click();
		
	}

}
