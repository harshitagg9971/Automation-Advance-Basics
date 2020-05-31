package dropDownList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingPool {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testingpool.com/wp-content/uploads/2015/08/DemoApplication.html");
		WebElement list1 = driver.findElement(By.xpath("//select[@name='Week']"));
		Select days = new Select(list1);
		List<WebElement> daysList = days.getOptions();
		
		System.out.println(daysList.size());
		for(int i=0;i<daysList.size();i++)
		{
			System.out.println(daysList.get(i).getText());
		}
		System.out.println(days.isMultiple());
		days.deselectAll();
		days.selectByVisibleText("Thursday");//1
		days.selectByValue("Mon");//2
		days.selectByIndex(6);//3
		System.out.println("**********************************************");
		List<WebElement> daylist2 = days.getAllSelectedOptions();
		System.out.println(daylist2.size());
		for(int i=0;i<daylist2.size();i++)
		{
			System.out.println(daylist2.get(i).getText());
		}
		WebElement firstselectedDay = days.getFirstSelectedOption();
		System.out.println("**********************************************");
		System.out.println(firstselectedDay.getText());
		System.out.println("**********************************************");
 		//------------------------------------------------------------------------------------------------------------//
		WebElement dropdownlist = driver.findElement(By.xpath("//select[@name='number']"));
		Select sel = new Select(dropdownlist);
		List<WebElement> listing = sel.getOptions();
		System.out.println(listing.size());
		for(int i=0;i<listing.size();i++)
		{
			System.out.println(listing.get(i).getText());
		}
		System.out.println(sel.isMultiple());
		sel.selectByVisibleText("2");
		
	}

}
