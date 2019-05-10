import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bill {
	WebDriver driver;

	public bill(WebDriver driver) {
		this.driver=driver;
	}
	
	public void billl() throws InterruptedException {
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
		WebElement offer=driver.findElement(By.xpath("//button[text()=' Offers']"));
		offer.click();
		System.out.println("offer open");
		
		Thread.sleep(1000);
		WebElement expressoffer=driver.findElement(By.xpath("//button[text()='Apply Express Offer']"));
		expressoffer.click();
		System.out.println("add express offer");
		
		Thread.sleep(1000);
		WebElement discount=driver.findElement(By.xpath("//input[@name='discountValue']"));
		discount.sendKeys("100");
		
		Thread.sleep(1000);
		WebElement comdiscount=driver.findElement(By.xpath("//input[@name='discountComment']"));
		comdiscount.sendKeys("Complimentary offer");
		
		Thread.sleep(1000);
		WebElement applyoffer=driver.findElement(By.xpath("//button[text()='Apply Offer']"));
		applyoffer.click();
		System.out.println("offer applied");
		
		Thread.sleep(1000);
		WebElement printbill=driver.findElement(By.xpath("//label[text()='PrintBill']"));
		printbill.click();
		
		System.out.println("Bill Print");
		
		Thread.sleep(3000);
		WebElement settlebill=driver.findElement(By.xpath("//div[@class='table-main-green']"));
		action.contextClick(settlebill).perform();
		
		System.out.println("settle bill");
		
		WebElement settlebill1=driver.findElement(By.xpath("//a[text()='Settle Bill']"));
		settlebill1.click();
		
		System.out.println("bill settle");
	
		Thread.sleep(1000);
		WebElement option1=driver.findElement(By.xpath("//input[@ng-model='otherOptionEnabled']"));
		option1.click();
		if(option1.isSelected()) {
			
			System.out.println("option is selected");
			
		}else {
			System.out.println("option is off");
		}
		
		WebElement growl=driver.findElement(By.xpath("//button[@ng-click='growlMessages.deleteMessage(message)']"));
		growl.click();
		System.out.println("grown msg ignore");
		
		Thread.sleep(1000);
		WebElement com=driver.findElement(By.xpath("//input[@ng-model='head.head']"));
		com.sendKeys("bill settle");
		
		Thread.sleep(1000);
		WebElement apply=driver.findElement(By.xpath("//button[text()='Apply']"));
		apply.click();
		System.out.println("settle");
		
		
		
	}
	
			
	}
	
	

