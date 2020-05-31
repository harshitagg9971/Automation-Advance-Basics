package popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeIncLink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		Set<String> a =  driver.getWindowHandles();
		System.out.println(a.size());
		ArrayList<String> al = new ArrayList<String>(a);
		
		driver.switchTo().window(al.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@class='button button--header']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("first-name")).sendKeys("Harshit");
		driver.findElement(By.id("last-name")).sendKeys("Aggarwal");
		driver.findElement(By.id("email")).sendKeys("harshitagg323@gmail.com");
		driver.findElement(By.id("company")).sendKeys("IBM");
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(al.get(0));
		System.out.println(driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]")).click();
		driver.findElement(By.id("logoutLink")).click();
	}

}
