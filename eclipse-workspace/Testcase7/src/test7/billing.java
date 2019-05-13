package test7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class billing {
	
	WebDriver driver;

	public billing(WebDriver driver) {
		this.driver=driver;
	}
	void billcut() throws InterruptedException {
		
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
		WebElement chikensoup=driver.findElement(By.xpath("//a[text()=' Manchow Chicken Soup']"));
		chikensoup.click();
		
		Thread.sleep(1000);
		WebElement com=driver.findElement(By.xpath("//textarea[@name='itemComment']"));
		com.sendKeys("aaaaaa");
		
		Thread.sleep(1000);
		Select al=new Select(driver.findElement(By.xpath("//select[@ng-model='discountForm.allergyComment']")));
		al.selectByVisibleText("Allergy hai sab se");
		
		Thread.sleep(1000);
		WebElement addon=driver.findElement(By.xpath("//a[text()='Fit Kit Addons']"));
		addon.click();
		System.out.println("add on selected");
		
		Thread.sleep(1000);
		WebElement addonegg=driver.findElement(By.xpath("//a[text()=' Veg & Chicken Meal Preference (10 day fit kit)']"));
		addonegg.click();
		System.out.println("addon");
		
		Thread.sleep(1000);
		WebElement add=driver.findElement(By.xpath("//a[text()='Add']"));
		add.click();
		System.out.println("add selected");
		
		Thread.sleep(1000);
		WebElement offer=driver.findElement(By.xpath("//button[text()=' Offers']"));
		offer.click();
		
		Thread.sleep(1000);
		WebElement applyexpress=driver.findElement(By.xpath("//button[text()='Apply Express Offer']"));
		applyexpress.click();
		
		Thread.sleep(1000);
		WebElement percent=driver.findElement(By.xpath("//input[@name='discountValue']"));
		percent.sendKeys("10");
		
		Thread.sleep(1000);
		WebElement come=driver.findElement(By.xpath("//input[@name='discountComment']"));
		come.sendKeys("aaaaaaaa");
		
		System.out.println("discount applied");
		
		Thread.sleep(1000);
		WebElement offerr=driver.findElement(By.xpath("//button[text()='Apply Offer']"));
		offerr.click();
		
		Thread.sleep(1000);
		WebElement printkot=driver.findElement(By.xpath("//label[text()='PrintKot']"));
		printkot.click();
		
		Thread.sleep(1000);
		WebElement printbill=driver.findElement(By.xpath("//label[text()='PrintBill']"));
		printbill.click();
		
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
		
		Thread.sleep(1000);
		WebElement settlebilll=driver.findElement(By.xpath("//button[text()='Settle Bill']"));
		settlebilll.click();
		System.out.println("Bill settle ");
		
		Thread.sleep(7000);
		WebElement grwolmsg=driver.findElement(By.xpath("//button[text()='×']"));
		grwolmsg.click();
		System.out.println("ignore");
		
		
	}

}
