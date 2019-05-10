package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Download {
	
	WebDriver driver;
	By username=By.xpath("//input[@name='username']");
	By password=By.xpath("//input[@name='password']");
	By login=By.xpath("//button[contains(text(),' Login & Rock!')]");
	
	public Download(WebDriver driver) {
		this.driver=driver;
	}
	void username(String strusername) {
		driver.findElement(username).sendKeys(strusername);
		
		
	}
	
	void password(String strpassword) {
		driver.findElement(password).sendKeys(strpassword);
		
	}
	void loginclick() {
	
		driver.findElement(login).submit();
	
	}
	
	void logintoposist(String strusername,String strpassword) {
		
		this.username(strusername);
		this.password(strpassword);
		this.loginclick();
	}
	
	
		
	}


