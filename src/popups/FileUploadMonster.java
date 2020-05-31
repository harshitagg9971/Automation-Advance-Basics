package popups;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadMonster {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");
		driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='action-cta']")));
		WebElement up = driver.findElement(By.xpath("//span[@class='action-cta']"));
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.moveToElement(up).perform();
		act.click(up).perform();
		//StringSelection file = new StringSelection("F:\\RoughOne.docx");
		//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
	}

}
