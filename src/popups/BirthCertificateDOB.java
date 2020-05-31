package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BirthCertificateDOB {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.birthcertificate.org.in");
		driver.findElement(By.xpath("//a[.='New']")).click();
		driver.findElement(By.id("datepicker")).click();
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select mon =  new Select(month);
		mon.selectByVisibleText("Apr");
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select yr =  new Select(year);
		yr.selectByVisibleText("1997");
		driver.findElement(By.xpath("//a[.='20']")).click();
	}

}
