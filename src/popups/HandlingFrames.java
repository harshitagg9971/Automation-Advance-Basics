package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","G:/selenium files/geckodriver-v0.26.0-win64/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("G:/STUDY MATERIAL/SELENIUM/may8(small topics)/Frames.html");
		driver.findElement(By.id("t1")).sendKeys("harshit");
		
		//driver.switchTo().frame(0);//switching using index of frame
		//driver.switchTo().frame("n1");//switching using id of frame
		driver.switchTo().frame("n1");//switching using name of frame
		driver.findElement(By.id("t2")).sendKeys("Harshit Aggarwal");
		
		//driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();//also do same work as parentFrame() method does
		driver.navigate().refresh();
		
		//driver.switchTo().frame(1);//index
		driver.switchTo().frame("f2");//switching using id of frame
		//driver.switchTo().frame("n2");//switching using name of frame
		driver.findElement(By.id("t2")).sendKeys("Rakesh aggarwal");
	}

}
