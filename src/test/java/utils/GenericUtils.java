package utils;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenericUtils {

	public WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		this.driver=driver;
	}
	public void SwitchToChildWindow() {
		String parent_Wh = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
		Set<String> all_WH = driver.getWindowHandles();
		
		for(String wh: all_WH) {
			if(!wh.equalsIgnoreCase(parent_Wh)) {
				driver.switchTo().window(wh);
				break;
			}
		}
	}
}
