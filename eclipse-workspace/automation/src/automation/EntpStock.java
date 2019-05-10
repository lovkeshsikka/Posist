package automation;


import java.util.NoSuchElementException;

import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;



public class EntpStock {
	
	public static void main(String[]args) throws NoSuchElementException, WebDriverException, UnexpectedTagNameException ,ElementNotFoundException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POSist\\Desktop\\testing\\testing\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		
		
		
		
		String baseurl="http://entpstock.posist.net/login";
		driver.get(baseurl);
		
		
		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		
		
		username.sendKeys("joutlet3");
		password.sendKeys("joutlet3");
		
		WebElement login=driver.findElement(By.xpath("//button[contains(text(),' Login & Rock!')]"));
		login.submit();
		
		System.out.println("login done");
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
	
		
	
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Reports']")));
		WebElement repo=driver.findElement(By.xpath("//a[text()='Reports']"));
		repo.click();
		System.out.println("you are in repo");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Analytics Reports']")));
		WebElement arepo=driver.findElement(By.xpath("//span[text()='Analytics Reports']"));
		arepo.click();
		
		System.out.println("now you can see a repot");
		
	
		WebElement hourlysales=driver.findElement(By.xpath("//a[text()='Hourly Sales']"));
		hourlysales.click();
		
		Select deployment=new Select(driver.findElement(By.xpath("//div[@class='ui-select-container select2 select2-container ng-valid ng-touched']]")));
		deployment.selectByVisibleText("//div[text()='joutlet3']");
		
		System.out.println("option selected");
		
		
	
		
	
}}

