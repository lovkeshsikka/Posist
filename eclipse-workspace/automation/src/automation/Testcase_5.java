package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase_5 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POSist\\Desktop\\testing\\testing\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
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
		WebElement itemmutoncurry=driver.findElement(By.xpath("//a[text()=' Mutton Nawabi Curry']"));
		itemmutoncurry.click();
		
		Thread.sleep(1000);
		Select waiter=new Select(driver.findElement(By.xpath("//select[@ng-model='bill._waiter']")));
		waiter.selectByVisibleText("Dwane Bravo");
		
		System.out.println("waiter selected");
		
		Thread.sleep(2000);
		WebElement printkot=driver.findElement(By.xpath("//label[text()='PrintKot']"));
		printkot.click();
		
		System.out.println("print kot");
		
		Thread.sleep(1000);
		WebElement voidkot=driver.findElement(By.xpath("//i[@class='fa fa-cog fa-spin fa-lg']"));
		voidkot.click();
		
		Thread.sleep(1000);
		WebElement voidkott=driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-remove']"));
		voidkott.click();
		
		Thread.sleep(1000);
		WebElement addcoment=driver.findElement(By.xpath("//input[@ng-model='comment.comment']"));
		addcoment.sendKeys("drop order");
		System.out.println("void order");
		
		Thread.sleep(1000);
		WebElement clickadd=driver.findElement(By.xpath("//button[text()='Add Comment']"));
		clickadd.click();
		
		Thread.sleep(1000);
		WebElement save=driver.findElement(By.xpath("//button[text()='Save']"));
		save.click();
		
		System.out.println("save KOt");
		
		Thread.sleep(1000);
		WebElement tableclick=driver.findElement(By.xpath("//strong[text()='1']"));
		tableclick.click();
		
		System.out.println("table clicked");
		
		Thread.sleep(6000);
		WebElement growl=driver.findElement(By.xpath("//button[@ng-click='growlMessages.deleteMessage(message)']"));
		growl.click();
		
		System.out.println("ignoreed");
		
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Reports']")));
		WebElement report=driver.findElement(By.xpath("//a[text()='Reports']"));
		report.click();
		System.out.println("Entering in report section");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Sales Reports']")));
		WebElement paymentdetails=driver.findElement(By.xpath("//span[text()='Sales Reports']"));
		paymentdetails.click();
		System.out.println("we enter the sales report");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Payment Details']")));
		WebElement payment=driver.findElement(By.xpath("//a[text()='Payment Details']"));
		payment.click();
		
		System.out.println("check the payment details");
		
		Thread.sleep(60000);
		WebElement genreports=driver.findElement(By.xpath("//a[text()='Generate Report']"));
		genreports.click();
		js.executeScript("window.scrollBy(0,500)");
		System.out.println("reports genrated");
		
		Thread.sleep(2000);
		WebElement Billno=driver.findElement(By.xpath("//div[@id='iteReportECons']"));
		WebElement tableinfo=Billno.findElement(By.xpath("//div[@id='iteReportECons']/table/tbody/tr[3]/td[1]"));
		String info=tableinfo.getText();
		System.out.println("Payment Details Bill no:-"+info);
		
		Thread.sleep(1000);
		WebElement Billtax=driver.findElement(By.xpath("//div[@id='iteReportECons']"));
		WebElement tableinfo2=Billtax.findElement(By.xpath("//div[@id='iteReportECons']/table/tbody/tr[3]/td[12]"));
		String info2=tableinfo2.getText();
		System.out.println("Taxinfo:-"+info2);
		
		Thread.sleep(2000);
		WebElement auditrepo=driver.findElement(By.xpath("//span[text()='Audit Reports']"));
		auditrepo.click();
		System.out.println("Enter in the audit repo");
		
		Thread.sleep(1000);
		WebElement kotdelete=driver.findElement(By.xpath("//a[text()='KOT Delete History']"));
		kotdelete.click();
		System.out.println("Kot delete History");
		
		Thread.sleep(2000);
		WebElement Genrepo=driver.findElement(By.xpath("//a[text()='Generate Report']"));
		Genrepo.click();
		js.executeScript("window.scrollBy(0,500)");
		System.out.println("generate Report");
		
		Thread.sleep(2000);
		WebElement kotnumber=driver.findElement(By.xpath(" //div[@id='iteReportECons']"));
		WebElement tableinfoo=kotnumber.findElement(By.xpath(" //div[@id='iteReportECons']/table/tbody/tr[4]/td[2]"));
		String infoo=tableinfoo.getText();
		System.out.println("Information in the table:"+infoo);
		
	
		WebElement items=driver.findElement(By.xpath(" //div[@id='iteReportECons']"));
		WebElement tableinfooo=items.findElement(By.xpath(" //div[@id='iteReportECons']/table/tbody/tr[4]/td[3]"));
		String information=tableinfooo.getText();
		System.out.println("infomation relatd to items:"+information);
		
	
		WebElement qty=driver.findElement(By.xpath(" //div[@id='iteReportECons']"));
		WebElement qtyy=qty.findElement(By.xpath(" //div[@id='iteReportECons']/table/tbody/tr[4]/td[7]"));
		String qtyinfo=qtyy.getText();
		System.out.println("Quanty:"+qtyinfo);
		
		WebElement billtotal=driver.findElement(By.xpath(" //div[@id='iteReportECons']"));
		WebElement billinfo=billtotal.findElement(By.xpath(" //div[@id='iteReportECons']/table/tbody/tr[4]/td[8]"));
		String infobill=billinfo.getText();
		System.out.println("bill:"+infobill);
		
		Thread.sleep(3000);
		WebElement trackrepo=driver.findElement(By.xpath("//a[text()='KOT Tracking']"));
		trackrepo.click();
		System.out.println("trackreport");
		
		Thread.sleep(1000);
		WebElement gennrepo=driver.findElement(By.xpath("//a[text()='Generate Report']"));
		gennrepo.click();
		System.out.println("we get report");
		
		Thread.sleep(2000);
		WebElement billno=driver.findElement(By.xpath("//div[@id='iteReportECons']"));
		WebElement informationn=billno.findElement(By.xpath("//div[@id='iteReportECons']/table/tbody/tr[11]/td[3]"));
		String rinfo=informationn.getText();
		System.out.println("Billnumber:"+rinfo);
		
		Thread.sleep(1000);
		WebElement kotnumberr=driver.findElement(By.xpath("//div[@id='iteReportECons']"));
		WebElement kotinfo=kotnumberr.findElement(By.xpath("//div[@id='iteReportECons']/table/tbody/tr[4]/td[1]"));
		String koinfo=kotinfo.getText();
		System.out.println("Kotnumber:-"+koinfo);
		
		Thread.sleep(1000);
		WebElement qtyyy=driver.findElement(By.xpath("//div[@id='iteReportECons']"));
		WebElement qtyyinfo=qtyyy.findElement(By.xpath("//div[@id='iteReportECons']/table/tbody/tr[6]/td[2]"));
		String qinfo=qtyyinfo.getText();
		System.out.println("Quanty:"+qinfo);
		
		Thread.sleep(2000);
		WebElement kotdetails=driver.findElement(By.xpath("//a[text()='KOT Detail']"));
		kotdetails.click();
		
		Thread.sleep(1000);
		WebElement kotgen=driver.findElement(By.xpath("//a[text()='Generate Report']"));
		kotgen.click();
		System.out.println("------KOT details-------------");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='iteReportECons']")));
		WebElement kotdetailss=driver.findElement(By.xpath("//div[@id='iteReportECons']"));
		WebElement kotnumberrr=kotdetailss.findElement(By.xpath("//div[@id='iteReportECons']/table/tbody/tr[1]/td[2]"));
		String numberkot=kotnumberrr.getText();
		System.out.println("Kot number"+numberkot);
		
		WebElement kotdetailsss=driver.findElement(By.xpath("//div[@id='iteReportECons']"));
		WebElement kotnumberrrr=kotdetailsss.findElement(By.xpath("//div[@id='iteReportECons']//table/tbody/tr[1]/td[7]"));
		String item=kotnumberrrr.getText();
		System.out.println("Kot number"+item);
		
		
		
		
	}

}
