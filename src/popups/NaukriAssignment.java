package popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		System.out.println(driver.getTitle());/////////
		Set<String> a = driver.getWindowHandles();
		ArrayList<String> al =  new ArrayList<String>(a);
		driver.switchTo().window(al.get(1));
		System.out.println(driver.getTitle());//////////
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//img)[1]")).click();
		
		Set<String> a1 = driver.getWindowHandles();
		ArrayList<String> al1 = new ArrayList<String>(a1);
		driver.switchTo().window(al1.get(3));
		System.out.println(driver.getTitle());///////////
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(al.get(1));
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
		
		driver.switchTo().window(al.get(0));
		System.out.println(driver.getTitle());
		driver.close();
	}

}
