package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FDAssignment {

	public static void main(String[] args) throws InterruptedException, AWTException {
		//System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","G:/selenium files/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.filehippo.com");
		driver.findElement(By.xpath("//a[text()='Popular software']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[text()='Google Chrome']/../../../../..//span[text()='Download']")).click();
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='Download Latest Version']")));
		driver.findElement(By.xpath("//a[.='Download Latest Version']")).click();
		driver.findElement(By.xpath("//a[@id='modal-di-continue-link']")).click();
	
		 Robot r = new Robot(); 
		 for(int i=0;i<2;i++) //put 3 to cancel download
		 	{ 
			 Thread.sleep(3000);
			 r.keyPress(KeyEvent.VK_TAB);
			}
		 Thread.sleep(3000);
		 r.keyPress(KeyEvent.VK_ENTER);
	}

}
