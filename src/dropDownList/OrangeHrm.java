package dropDownList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		WebElement list1 = driver.findElement(By.xpath("//select[@id='searchSystemUser_userType']"));
		Select userRole = new Select(list1);
		System.out.println(userRole.isMultiple());
		userRole.selectByIndex(2);
		WebElement list2 = driver.findElement(By.xpath("//select[@id='searchSystemUser_status']"));
		Select status = new Select(list2);
		System.out.println(status.isMultiple());
		status.selectByVisibleText("Enabled");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[contains(text(),'Directory')]")).click();
		WebElement list3 =  driver.findElement(By.xpath("//select[@id='searchDirectory_job_title']"));
		Select jobTitle = new Select(list3);
		System.out.println(jobTitle.isMultiple());
		jobTitle.selectByVisibleText("CEO");
		WebElement list4 =  driver.findElement(By.xpath("//select[@id='searchDirectory_location']"));
		Select location = new Select(list4);
		System.out.println(location.isMultiple());
		jobTitle.selectByVisibleText("India");
	}

}
