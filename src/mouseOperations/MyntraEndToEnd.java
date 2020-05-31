package mouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

public class MyntraEndToEnd {//NOT WORKING 

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver","G:/selenium files/geckodriver-v0.26.0-win64/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		Thread.sleep(5000);
		WebElement men = driver.findElement(By.xpath("//a[@class='desktop-main'][contains(text(),'Men')]"));
		Actions  act = new Actions(driver);
		act.moveToElement(men).perform();	
		Thread.sleep(5000);
		WebElement casualShoes = driver.findElement(By.xpath("(//a[text()='Casual Shoes'])[1]"));
		act.moveToElement(casualShoes).click(casualShoes).perform();
		Thread.sleep(5000);
		WebElement shoe = driver.findElement(By.xpath("//body/div[@id='mountRoot']/div/div[@class='application-base']/main[@class='search-base']/div[contains(@class,'row-base')]/div[@class='search-rightContainer column-base']/div[@id='desktopSearchResults']/div[@class='search-searchProductsContainer row-base']/section/ul[@class='results-base']/li[1]/div[3]/span[1]"));
		act.moveToElement(shoe).click(shoe).perform();
	}

}
