package automation;



import java.util.concurrent.TimeoutException;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class order {

	
	
	
	public static void main(String[] args) throws TimeoutException,WebDriverException, InterruptedException,NoSuchElementException{
		
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
		WebDriverWait wait=new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//strong[text()='1']")));
		WebElement selecttable=driver.findElement(By.xpath("//strong[text()='1']"));
		selecttable.click();
	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']")));
		WebElement accept=driver.findElement(By.xpath("//button[text()='OK']"));
		Actions action=new Actions(driver);
		action.click(accept).build().perform();

		Thread.sleep(1000);
		action.moveToElement(selecttable).click().release().perform();
		
		System.out.println("add covers");
		
		WebElement covers=driver.findElement(By.xpath("//input[@id='coverModalId']"));
		covers.sendKeys("4");
		
		WebElement coveradded=driver.findElement(By.xpath("//button[text()='Add Covers']"));
		coveradded.click();
		
		System.out.println("now select the items");
		
		Thread.sleep(1000); 
		WebElement itemRoti=driver.findElement(By.xpath("//a[text()=' Roti']"));
		itemRoti.click();
		
		Thread.sleep(1000);
		WebElement incrementroti=driver.findElement(By.xpath("//a[@ng-click='bill.incrementQuantity((bill._items.length-1) - $index)']"));
		incrementroti.click();
		System.out.println("Clicked on first Time Roti     ,<<<<   ...>>>>>>>.");
		incrementroti.click();
		incrementroti.click();
		
		System.out.println("we select roti");
		
		Thread.sleep(1000);
		WebElement beers=driver.findElement(By.xpath("//a[text()='BEERS']"));
		beers.click();
		System.out.println("select the beer you want");
		
		WebElement kingfisher=driver.findElement(By.xpath("//a[text()=' Kingfisher Ultra Can']"));
		kingfisher.click();
		System.out.println("beer selected");
		
		beers.click();
		
		System.out.println("now if you want to select any thing you can");
	
		Thread.sleep(1000);
		WebElement increment=driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		increment.click();
		increment.click();
		increment.click();
		
		Select waiter=new Select(driver.findElement(By.xpath("//select[@ng-model='bill._waiter']")));
		waiter.selectByVisibleText("Dwane Bravo");
		waiter.selectByIndex(1);
		
		System.out.println("waiter selected");
		
		WebElement printkot=driver.findElement(By.xpath("//label[text()='PrintKot']"));
		printkot.click();
		
		System.out.println("print KOT done");
		
		Thread.sleep(1000);
		WebElement printbill=driver.findElement(By.xpath("//label[text()='PrintBill']"));
		printbill.click();
		System.out.println("Print the bill");
		
		Thread.sleep(1000);
		WebElement settlebill=driver.findElement(By.xpath("//div[@class='table-main-green']"));
		action.contextClick(settlebill).perform();
		
		System.out.println("settle bill");
		
		WebElement settlebill1=driver.findElement(By.xpath("//a[text()='Settle Bill']"));
		settlebill1.click();
		
		System.out.println("payment time");
		
		WebElement paymentmode=driver.findElement(By.xpath("//button[text()='Add Cash Payment']"));
		paymentmode.click();
		
		System.out.println("Add payment");
		
		Thread.sleep(1000);
		WebElement finalpayment=driver.findElement(By.xpath("//button[text()='Settle Bill']"));
		finalpayment.click();
		
		System.out.println("bill settled");
		
		}
	
	}
	
	

