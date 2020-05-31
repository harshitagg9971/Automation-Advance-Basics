package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {

	public static void main(String[] args) 
	{	System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//implicitly wait
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		WebElement settings=driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_settings']"));
		WebElement tasks=driver.findElement(By.xpath("//div[.='Tasks']"));
		
		WebDriverWait wait=new WebDriverWait(driver, 5);
		//wait.until(ExpectedConditions.titleContains("naimisha"));
		//wait.until(ExpectedConditions.titleContains("actiTIME - Enter"));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutlink")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='popup_menu_button popup_menu_button_settings']")));
		
		//wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logoutLink")));
		wait.until(ExpectedConditions.textToBePresentInElement(tasks, "Tasks"));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='popup_menu_button popup_menu_button_settings']")));
		//wait.until(ExpectedConditions.elementToBeClickable(settings));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("NCSA6")));
		
		driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_settings']")).click();

	}

}
