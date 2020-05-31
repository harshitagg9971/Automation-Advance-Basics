package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']//div[contains(text(),'Login')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.titleContains("harshit")); giving timeout exception because of wrong title
		//wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='logoutLink']")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='logoutlink']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='menu_icon'])[2]")));
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
	}

}
