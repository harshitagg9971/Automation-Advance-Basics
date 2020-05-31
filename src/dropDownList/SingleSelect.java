package dropDownList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) throws InterruptedException{
		//System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","G:/selenium files/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///G:/selenium%20study%20material/april29(drop%20down%20list%20handling)/SelectClass.html");
		WebElement listbox = driver.findElement(By.xpath("//select[@name='employess']"));
		Select sel = new Select(listbox);
		System.out.println(sel.isMultiple());
		/*
		 * sel.selectByVisibleText("Rashika"); Thread.sleep(2000);
		 * sel.selectByValue("K"); Thread.sleep(2000); sel.selectByIndex(1);
		 */
		//sel.selectByVisibleText("Pooja");
		sel.selectByIndex(7);
		sel.deselectByVisibleText("Noida");//this will give NoSuchElementException
	}

}
