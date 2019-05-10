package Testcase;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Billsplit {
	
	WebDriver driver;

	public Billsplit(WebDriver driver) {
		this.driver=driver;
	}
	
	public void billsplit() throws InterruptedException {
		
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
		WebElement keema=driver.findElement(By.xpath("//a[text()=' Chicken Keema Balls']"));
		keema.click();
		
		Thread.sleep(1000);
		WebElement beers=driver.findElement(By.xpath("//a[text()='BEERS']"));
		beers.click();
		
		Thread.sleep(1000);
		WebElement kingfisher=driver.findElement(By.xpath("//a[text()=' Kingfisher Ultra Can']"));
		kingfisher.click();
		kingfisher.click();
		kingfisher.click();
		kingfisher.click();
		kingfisher.click();
		
		Thread.sleep(1000);
		beers.click();
		System.out.println("order food");
		
		Thread.sleep(1000);
		WebElement manch=driver.findElement(By.xpath("//a[text()=' Chicken Kalmi Kebab (3 Pcs )']"));
		manch.click();
		manch.click();
		
		Thread.sleep(1000);
		Select waiter=new Select(driver.findElement(By.xpath("//select[@ng-model='bill._waiter']")));
		waiter.selectByVisibleText("Dwane Bravo");
		
		System.out.println("waiter selected");
		
		Thread.sleep(1000);
		WebElement printKOT=driver.findElement(By.xpath("//label[text()='PrintKot']"));
		printKOT.click();

		System.out.println("printkot done");
		
		
		Thread.sleep(1000);
		WebElement printbill=driver.findElement(By.xpath("//label[text()='PrintBill']"));
		printbill.click();
		
		System.out.println("Bill Print");
		
		Thread.sleep(3000);
		WebElement settlebill=driver.findElement(By.xpath("//div[@class='table-main-green']"));
		action.contextClick(settlebill).perform();
		System.out.println("bill");
		
		Thread.sleep(1000);
		WebElement splitbill=driver.findElement(By.xpath("//a[text()='Split Bill']"));
		splitbill.click();
		System.out.println("now se the split bill");
		
		Thread.sleep(1000);
		WebElement spiltbycata=driver.findElement(By.xpath("//a[text()='Split By Food and Liquor']"));
		spiltbycata.click();
		
		Thread.sleep(1000);
		WebElement comment=driver.findElement(By.xpath("//input[@ng-model='splitComment.comment']"));
		comment.sendKeys("bill split ");
		
		Thread.sleep(1000);
		WebElement split=driver.findElement(By.xpath("//button[text()='Split']"));
		split.click();
		System.out.println("check the bill");
		
		Thread.sleep(6000);
		WebElement growl=driver.findElement(By.xpath("//button[@ng-click='growlMessages.deleteMessage(message)']"));
		growl.click();
		System.out.println("ignoreed");
		
		Thread.sleep(1000);
		WebElement split1=driver.findElement(By.xpath("//strong[text()='1-1']"));
		split1.click();
		System.out.println("Now print the bill");
		
		Thread.sleep(1000);
		WebElement print=driver.findElement(By.xpath("//label[text()='PrintBill']"));
		print.click();
		System.out.println("now need to settle");
		
		Thread.sleep(1000);
		WebElement comnt=driver.findElement(By.xpath("//input[@ng-model='comment.comment']"));
		comnt.sendKeys("abcdeeeeee");
		
		Thread.sleep(1000);
		WebElement addcom=driver.findElement(By.xpath("//button[text()='Add Comment']"));
		addcom.click();
		System.out.println("comment click");
		
		Thread.sleep(1000);
		WebElement split2=driver.findElement(By.xpath("//strong[text()='1-2']"));
		split2.click();
		System.out.println("click");
		
		Thread.sleep(1000);
		WebElement printb=driver.findElement(By.xpath("//label[text()='PrintBill']"));
		printb.click();
		System.out.println("bill print of split 2");
		
		Thread.sleep(1000);
		WebElement c=driver.findElement(By.xpath("//input[@ng-model='comment.comment']"));
		c.sendKeys("aaaaaaaaaa");
		
		Thread.sleep(1000);
		WebElement addcomm=driver.findElement(By.xpath("//button[text()='Add Comment']"));
		addcomm.click();
		System.out.println("comclick");
		
		Thread.sleep(1000);
		WebElement table1=driver.findElement(By.xpath("//strong[text()='1-1']"));
		action.contextClick(table1).perform();
		System.out.println("table settle");
		
		Thread.sleep(1000);
		WebElement settlement=driver.findElement(By.xpath("//a[text()='Settle Bill']"));
		settlement.click();
		System.out.println("settle bill");
		
		Thread.sleep(1000);
		WebElement addcash=driver.findElement(By.xpath("//button[text()='Add Cash Payment']"));
		addcash.click();
		System.out.println("addcash");
		
		
		Thread.sleep(1000);
		WebElement sttlebill=driver.findElement(By.xpath("//button[text()='Settle Bill']"));
		sttlebill.click();
		System.out.println("billsettle");
		
		Thread.sleep(1000);
		WebElement table2=driver.findElement(By.xpath("//strong[text()='1-2']"));
		action.contextClick(table2).perform();
		System.out.println("table settle");
		
		Thread.sleep(1000);
		WebElement settlement1=driver.findElement(By.xpath("//a[text()='Settle Bill']"));
		settlement1.click();
		System.out.println("settle bill");
		
		Thread.sleep(1000);
		WebElement addcash1=driver.findElement(By.xpath("//button[text()='Add Cash Payment']"));
		addcash1.click();
		System.out.println("addcash");
		
		
		Thread.sleep(1000);
		WebElement sttlebill1=driver.findElement(By.xpath("//button[text()='Settle Bill']"));
		sttlebill1.click();
		System.out.println("billsettle");
		
		Thread.sleep(7000);
		WebElement growle=driver.findElement(By.xpath("//button[@ng-click='growlMessages.deleteMessage(message)']"));
		growle.click();
		System.out.println("grown msg ignore");
		
		
	}
	
	
}
