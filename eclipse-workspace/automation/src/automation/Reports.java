package automation;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reports {
	public static void main(String[] args) throws InterruptedException,TimeoutException,WebDriverException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POSist\\Desktop\\testing\\testing\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions action=new Actions(driver);
		WebDriverWait wait=new WebDriverWait(driver, 80);
		
		String baseurl="http://entpstock.posist.net/login";
		driver.get(baseurl);
		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		
		
		username.sendKeys("joutlet3");
		password.sendKeys("joutlet3");
		
		WebElement login=driver.findElement(By.xpath("//button[contains(text(),' Login & Rock!')]"));
		login.submit();
		
		System.out.println("login done");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='×']")));
		driver.navigate().refresh();
		WebElement dismiss=driver.findElement(By.xpath("//button[text()='×']"));
		if(dismiss.isDisplayed()) {
			Thread.sleep(5000);
			dismiss.click();
		}
		
		else {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Reports']")));
		WebElement report=driver.findElement(By.xpath("//a[text()='Reports']"));
		action.moveToElement(report).click(report).build().perform();
		System.out.println("reports open");
	}
	}}
	


