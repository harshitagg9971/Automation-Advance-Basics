package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ACAssignment4 {

	public static void main(String[] args) {
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
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();//for settings
		driver.findElement(By.xpath("//a[text()='Leave Types']")).click();
		driver.findElement(By.xpath("//span[.='Create Leave Type']")).click();
		driver.findElement(By.id("leaveTypeLightBox_nameField")).sendKeys("Corona leave");
		driver.findElement(By.id("leaveTypeLightBox_cancelBtn")).click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();

	}

}
