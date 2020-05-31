package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver","G:/selenium files/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads");
		driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
		Robot r = new Robot();
		for(int i=0;i<3;i++)//put 4 to cancel download
		{
			Thread.sleep(5000);
			r.keyPress(KeyEvent.VK_TAB);
		}
		r.keyPress(KeyEvent.VK_ENTER);
	}

}
