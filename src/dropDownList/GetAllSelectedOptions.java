package dropDownList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","G:/selenium files/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///G:/selenium%20study%20material/april29(drop%20down%20list%20handling)/SelectClassForMultiple.html");
		WebElement listbox = driver.findElement(By.xpath("//select[@name='employess']"));
		Select sel = new Select(listbox);
		System.out.println(sel.isMultiple());
		sel.selectByVisibleText("Rashika");
		sel.selectByValue("K"); 
		sel.selectByIndex(3);
		sel.selectByVisibleText("Pooja");
		List<WebElement> selectedOptions = sel.getAllSelectedOptions();
		System.out.println(selectedOptions.size());
		for(int i=0;i<selectedOptions.size();i++) 
		{
			System.out.println(selectedOptions.get(i).getText());	
		}
	}

}
