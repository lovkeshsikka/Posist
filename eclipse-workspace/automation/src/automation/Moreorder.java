package automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Moreorder {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POSist\\Desktop\\testing\\testing\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 80);
		Actions action=new Actions(driver);
		
		String baseurl="http://entpstock.posist.net/login";
		driver.get(baseurl);
		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		
		
		username.sendKeys("joutlet3");
		password.sendKeys("joutlet3");
		
		WebElement login=driver.findElement(By.xpath("//button[contains(text(),' Login & Rock!')]"));
		login.submit();
		
		
		System.out.println("lets select the table");
		

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//strong[text()='1']")));
		WebElement selecttable=driver.findElement(By.xpath("//strong[text()='1']"));
		selecttable.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']")));
		WebElement accept=driver.findElement(By.xpath("//button[text()='OK']"));
		
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
		WebElement muttonnawabi=driver.findElement(By.xpath("//a[text()=' Mutton Nawabi Curry']"));
		muttonnawabi.click();
		
		System.out.println("Muttonnawabi added");
		
		
		WebElement offer=driver.findElement(By.xpath("//a[@class='btn btn-default btn-sm']"));
		offer.click();
		System.out.println("please select the addons");
		
		
		WebElement discount=driver.findElement(By.xpath("//input[@name='discountValue']"));
		discount.sendKeys("20");
		System.out.println("add 20% discount");

		WebElement contondiscount=driver.findElement(By.xpath("//input[@name='discountComment']"));
		contondiscount.sendKeys("enjoy......");
		
		
		WebElement itemscom=driver.findElement(By.xpath("//textarea[@name='itemComment']"));
		itemscom.sendKeys("discount");
		
		
		Select Allergy=new Select(driver.findElement(By.xpath("//select[@ng-model='discountForm.allergyComment']")));
		Allergy.selectByVisibleText("Allergy hai sab se");
	
		
		System.out.println("Allergy selected");

		WebElement Add=driver.findElement(By.xpath("//a[text()='Add']"));
		Add.click();
		System.out.println("Discount applied please check.....");
		
		Select waiter=new Select(driver.findElement(By.xpath("//select[@ng-model='bill._waiter']")));
		waiter.selectByVisibleText("Dwane Bravo");

		
		System.out.println("waiter selected");
	
		
		WebElement printkot=driver.findElement(By.xpath("//label[text()='PrintKot']"));
		printkot.click();
		
		System.out.println("Order reached to Kitchen");
		
		Thread.sleep(1000);
		WebElement printbill=driver.findElement(By.xpath("//label[text()='PrintBill']"));
		printbill.click();
		
		System.out.println("bill print");
		
		
		Thread.sleep(1000);
		WebElement settlebill=driver.findElement(By.xpath("//div[@class='table-main-green']"));
		action.contextClick(settlebill).perform();
		
		System.out.println("settle bill");
		
		WebElement settlebill1=driver.findElement(By.xpath("//a[text()='Settle Bill']"));
		settlebill1.click();
		
		System.out.println("payment time");
		
		
		
		Thread.sleep(1000);
		WebElement coupons=driver.findElement(By.xpath("//tab-heading[text()='Coupons']"));
		coupons.click();
		
		Thread.sleep(1000);
		Select drop=new Select(driver.findElement(By.xpath("//select[@name='couponName']")));
		drop.selectByVisibleText("Meal Vouchers");

		
		System.out.println("coupons selected");
		
		WebElement couponno=driver.findElement(By.xpath("//input[@ng-model='bill.couponForm.transaction_number']"));
		couponno.sendKeys("1001");
		System.out.println("coupon no applied");
		

		
		
		Thread.sleep(1000);
		WebElement addpayment=driver.findElement(By.xpath("//button[text()='Add Coupon Payment']"));
		addpayment.click();
		System.out.println("payment done");
		
		Thread.sleep(1000);
		WebElement settle=driver.findElement(By.xpath("//button[text()='Settle Bill']"));
		settle.click();
		System.out.println("bill settled");
		
		
		Thread.sleep(1000);
		WebElement reports=driver.findElement(By.xpath("//a[text()='Reports']"));
		action.moveToElement(reports).click().build().perform();
		System.out.println("you are in reports");
		
		
		
	}

}
