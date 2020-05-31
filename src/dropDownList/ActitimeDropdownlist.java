package dropDownList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActitimeDropdownlist {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']//div[contains(text(),'Login')]")).click();

		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("new work by harshit");;
		WebElement list = driver.findElement(By.xpath("//select[@name='active']"));
		Select option = new Select(list);
		option.selectByVisibleText("archived");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
}
