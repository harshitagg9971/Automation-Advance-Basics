package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.americanairlines.in");
		driver.findElement(By.xpath("(//button[@type='button'][@class='ui-datepicker-trigger'])[1]")).click();
		driver.findElement(By.xpath("(//a[.='10'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='button'][@class='ui-datepicker-trigger'])[2]")).click();
		//driver.findElement(By.xpath("(//a[.='10'])[2]")).click();
		for(int i=0;i<4;i++) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
		}
		driver.findElement(By.xpath("(//a[.='10'])[2]")).click();
	}

}
