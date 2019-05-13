package testcase3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Billing {
	WebDriver driver;
	
	public Billing(WebDriver driver) {
		this.driver=driver;
	}
	
	 void bill() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, 400);
		
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
		
		Thread.sleep(1000);
		WebElement covers=driver.findElement(By.xpath("//input[@id='coverModalId']"));
		covers.sendKeys("4");
		
		WebElement coveradded=driver.findElement(By.xpath("//button[text()='Add Covers']"));
		coveradded.click();

		Thread.sleep(1000);
		WebElement itemRoti=driver.findElement(By.xpath("//a[text()=' Roti']"));
		itemRoti.click();
		
		Thread.sleep(1000);
		WebElement itemmutoncurry=driver.findElement(By.xpath("//a[text()=' Mutton Nawabi Curry']"));
		itemmutoncurry.click();
		
		Thread.sleep(1000);
		Select waiter=new Select(driver.findElement(By.xpath("//select[@ng-model='bill._waiter']")));
		waiter.selectByVisibleText("Dwane Bravo");
		
		System.out.println("waiter selected");
		
		Thread.sleep(1000);
		WebElement printKOT=driver.findElement(By.xpath("//label[text()='PrintKot']"));
		printKOT.click();

		System.out.println("printkot done");
		
		Thread.sleep(1000);
		WebElement deleteitems=driver.findElement(By.xpath("//div[@id=\"main1\"]/div[4]/div/div/div[1]/div[2]/div[2]/div[3]/div/div/table[2]/tbody/tr[1]/td[1]"));
		deleteitems.click();
		System.out.println("remove itemss");
		
		Thread.sleep(1000);
		WebElement removeall=driver.findElement(By.xpath("//button[text()='Remove All']"));
		removeall.click();
		System.out.println("remove item");
		
		Thread.sleep(1000);
		WebElement addcom=driver.findElement(By.xpath("//input[@ng-model='comment.comment']"));
		addcom.sendKeys("aaaaaa");
		System.out.println("coment add");
		
		Thread.sleep(1000);
		WebElement change=driver.findElement(By.xpath("//a[text()='Change Quantity']"));
		change.click();
		System.out.println("item deleted");

		Thread.sleep(1000);
		WebElement printbill=driver.findElement(By.xpath("//label[text()='PrintBill']"));
		printbill.click();
		System.out.println("now print the bill");
		
		Thread.sleep(3000);
		WebElement settlebill=driver.findElement(By.xpath("//div[@class='table-main-green']"));
		action.contextClick(settlebill).perform();
		
		System.out.println("settle bill");
		
		WebElement settlebill1=driver.findElement(By.xpath("//a[text()='Settle Bill']"));
		settlebill1.click();
		
		System.out.println("bill settle");
		
		Thread.sleep(1000);
		WebElement addpay=driver.findElement(By.xpath("//button[text()='Add Cash Payment']"));
		addpay.click();
		System.out.println("payment added");
		
		Thread.sleep(1000);
		WebElement settle=driver.findElement(By.xpath("//button[text()='Settle Bill']"));
		settle.click();
		System.out.println("after settlement");
		
		Thread.sleep(7000);
		WebElement growl=driver.findElement(By.xpath("//button[@ng-click='growlMessages.deleteMessage(message)']"));
		growl.click();
		System.out.println("grown msg ignore");
		
		
		
		
		
		
		
		
	}
}
