package popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriChildBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		Set<String> a = driver.getWindowHandles(); 
		System.out.println(a.size());
		ArrayList<String> al = new ArrayList<String>(a);
		System.out.println(al.size());
		
		driver.switchTo().window(al.get(2));
		driver.close();
		System.out.println(driver.getTitle());// NoSuchWindowException
		
		/*
		 * driver.switchTo().window(al.get(1)); System.out.println(driver.getTitle());
		 * driver.close();
		 * 
		 * driver.switchTo().window(al.get(0)); System.out.println(driver.getTitle());
		 */
	}

}
