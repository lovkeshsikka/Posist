package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Downloadreports {
	
	WebDriver driver;
	
	public Downloadreports(WebDriver driver) {
		this.driver=driver;
	}
	
public	void report() throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Reports']")));
		WebElement repo=driver.findElement(By.xpath("//a[text()='Reports']"));
		repo.click();
		System.out.println("Enter in the report section");
	}

}
