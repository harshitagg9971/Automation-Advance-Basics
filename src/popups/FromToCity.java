package popups;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FromToCity {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.americanairlines.in");
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys("las");
		List<WebElement> from = driver.findElements(By.xpath("//a[contains(.,'Las')]"));
		for(int i=0;i<from.size();i++) 
		{
			if(from.get(i).getText().equals("Las Vegas (LAS), Nevada, USA")) 
			{
				from.get(i).click();			
			}
		}
		
		driver.findElement(By.id("reservationFlightSearchForm.destinationAirport")).sendKeys("london");
		List<WebElement> to = driver.findElements(By.xpath("//a[contains(.,'London')]"));
		for(int i=0;i<to.size();i++) 
		{
			if(to.get(i).getText().equals("London Gatwick (LGW), United Kingdom")) 
			{
				to.get(i).click();			
			}
		}
		
		WebElement adult = driver.findElement(By.xpath("//select[@name='adults']"));
		Select sel = new Select(adult);
		sel.selectByVisibleText("4");
		driver.findElement(By.xpath("(//button[@type='button'][@class='ui-datepicker-trigger'])[1]")).click();
		driver.findElement(By.xpath("(//a[.='25'])[2]")).click();
		driver.findElement(By.xpath("(//button[@type='button'][@class='ui-datepicker-trigger'])[2]")).click();
		for(int i=0;i<6;i++) 
		{
			driver.findElement(By.xpath("//a[@title='Next']")).click();
		}
		driver.findElement(By.xpath("(//a[.='30'])[2]")).click();
		WebElement children =driver.findElement(By.xpath("//select[@name='children']"));
		Select sel1 = new Select(children);
		sel1.selectByVisibleText("2");
		driver.findElement(By.id("bookingModule-submit")).click();
	}

}
