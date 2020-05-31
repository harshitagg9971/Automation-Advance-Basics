package assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentMarch16 
{
	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);

		Set<String> a = driver.getWindowHandles();
		ArrayList<String> a1 = new ArrayList<String>(a);
		
		System.out.println(driver.getWindowHandles().size());

		driver.switchTo().window(a1.get(1)); 
		
		driver.get("https://www.facebook.com");  
		System.out.println(driver.getTitle());
		  
		r.keyPress(KeyEvent.VK_CONTROL); 
		r.keyPress(KeyEvent.VK_TAB);
		  
		System.out.println(driver.getTitle());
		  
		r.keyPress(KeyEvent.VK_CONTROL); 
		r.keyPress(KeyEvent.VK_W);
	}
}
