package dropDownList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDOB {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement daylist = driver.findElement(By.xpath("//select[@id='day']"));
		Select day = new Select(daylist);
		WebElement monthlist = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(monthlist);
		WebElement yearlist = driver.findElement(By.xpath("//select[@id='year']"));
		Select year = new Select(yearlist);
		day.selectByVisibleText("20");
		month.selectByVisibleText("Nov");
		year.selectByVisibleText("1997");
		System.out.println(day.isMultiple());
		System.out.println(month.isMultiple());
		System.out.println(year.isMultiple());
	}

}
