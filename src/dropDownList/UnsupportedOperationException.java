package dropDownList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UnsupportedOperationException {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","G:/selenium files/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///G:/selenium%20study%20material/april29(drop%20down%20list%20handling)/SelectClass.html");
		WebElement listbox = driver.findElement(By.xpath("//select[@name='employess']"));
		Select sel = new Select(listbox);
		System.out.println(sel.isMultiple()); 
		sel.selectByVisibleText("Sunita");
		sel.deselectByVisibleText("Sunita");//this will give UnsupportedOperationException bcz deselect can only be performed on 
		//multi select drop down list and this one here is single select drop down list

	}

}
