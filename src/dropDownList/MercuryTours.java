package dropDownList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryTours {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/selenium/newtours/register.php");
		//driver.findElement(By.xpath("//button[@id='details-button']")).click();
		//driver.findElement(By.xpath("//a[text()='Proceed to demo.guru99.com (unsafe)']")).click();
		WebElement CountryList =  driver.findElement(By.xpath("//select[@name='country']"));
		Select country = new Select(CountryList);
		List<WebElement> countries =  country.getOptions();
		System.out.println(countries.size());
		for(int i=0;i<countries.size();i++)
		{
			System.out.println(countries.get(i).getText());
		}
		System.out.println(country.isMultiple());
		country.selectByVisibleText("ARUBA");
		//country.selectByIndex(2);
		//country.selectByValue("");
 	}

}
