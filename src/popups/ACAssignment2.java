package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ACAssignment2 {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.id("leaveTypeLightBox_commitBtn")).click();
		Thread.sleep(10000);
		//WebDriverWait wait = new WebDriverWait(driver, 15);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//tr[@class='leaveTypeListRow hover']//td[contains(@class,'leaveType')])[7]")));
		driver.findElement(By.xpath("(//tr[@class='leaveTypeListRow hover']//td[contains(@class,'leaveType')])[7]")).click();
		Alert alt = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alt.getText());
		alt.accept();
	}

}
