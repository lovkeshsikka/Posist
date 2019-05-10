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


public class Testcase_1 {
	
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
		WebElement itemdiscount=driver.findElement(By.xpath("//a[@ng-hide='item.configuration.rules && !item.configuration.rules.taxAsItem']"));
		itemdiscount.click();
		System.out.println("Item wise discount");
		
		Thread.sleep(1000);
		WebElement discount=driver.findElement(By.xpath("//input[@name='discountValue']"));
		discount.sendKeys("10");
		
		WebElement discoment=driver.findElement(By.xpath("//input[@name='discountComment']"));
		discoment.sendKeys("extra offer");
		
		WebElement itemcom=driver.findElement(By.xpath("//textarea[@name='itemComment']"));
		itemcom.sendKeys("discount on items");
		
		Thread.sleep(2000);
		Select Allergy=new Select(driver.findElement(By.xpath("//select[@ng-model='discountForm.allergyComment']")));
		Allergy.selectByVisibleText("Allergy hai sab se");

		WebElement Add=driver.findElement(By.xpath("//a[text()='Add']"));
		Add.click();
		System.out.println("Discount applied please check.....");
		
		Thread.sleep(1000);
		WebElement offer=driver.findElement(By.xpath("//button[text()=' Offers']"));
		offer.click();
		System.out.println("offer applied");
		
		Thread.sleep(1000);
		WebElement applyexpress=driver.findElement(By.xpath("//button[text()='Apply Express Offer']"));
		applyexpress.click();
		
		Thread.sleep(1000);
		WebElement discountt=driver.findElement(By.xpath("//input[@name='discountValue']"));
		discountt.sendKeys("10");
		
		Thread.sleep(1000);
		WebElement commentdis=driver.findElement(By.xpath("//input[@name='discountComment']"));
		commentdis.sendKeys("dhamal");
		
		Thread.sleep(1000);
		WebElement applyoffer=driver.findElement(By.xpath("//button[text()='Apply Offer']"));
		applyoffer.click();
		System.out.println("offer applied");
		
		Thread.sleep(1000);
		WebElement printkot=driver.findElement(By.xpath("//label[text()='PrintKot']"));
		printkot.click();
		
		System.out.println("print KOT done");
		
		Thread.sleep(1000);
		WebElement printbill=driver.findElement(By.xpath("//label[text()='PrintBill']"));
		printbill.click();
		
		System.out.println("print of the bill");
		
		
		Thread.sleep(3000);
		WebElement settlebill=driver.findElement(By.xpath("//div[@class='table-main-green']"));
		action.contextClick(settlebill).perform();
		
		System.out.println("settle bill");
		
		WebElement settlebill1=driver.findElement(By.xpath("//a[text()='Settle Bill']"));
		settlebill1.click();
		
		System.out.println("bill settle");
		
		WebElement paymentmode=driver.findElement(By.xpath("//button[text()='Add Cash Payment']"));
		paymentmode.click();
		
		System.out.println("Add payment");
		
		Thread.sleep(1000);
		WebElement finalpayment=driver.findElement(By.xpath("//button[text()='Settle Bill']"));
		finalpayment.click();
		
		System.out.println("bill settled");
		
		Thread.sleep(6000);
		WebElement growl=driver.findElement(By.xpath("//button[@ng-click='growlMessages.deleteMessage(message)']"));
		growl.click();
		
		
		System.out.println("ignoreed");
		
		Thread.sleep(7000);
		WebElement repo=driver.findElement(By.xpath("//a[text()='Reports']"));
		repo.click();
		System.out.println("We enter in the report section");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Sales Reports']")));
		WebElement paymentdetails=driver.findElement(By.xpath("//span[text()='Sales Reports']"));
		paymentdetails.click();
		System.out.println("we enter the sales report");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Payment Details']")));
		WebElement payment=driver.findElement(By.xpath("//a[text()='Payment Details']"));
		payment.click();
		
		System.out.println("-----------------check the payment details------------------------------");
		
		Thread.sleep(60000);
		WebElement genreports=driver.findElement(By.xpath("//a[text()='Generate Report']"));
		genreports.click();
		js.executeScript("window.scrollBy(0,500)");
		System.out.println("reports genrated");
		
		Thread.sleep(3000);
		WebElement Billno=driver.findElement(By.xpath("//div[@id='iteReportECons']"));
		WebElement tableinfo=Billno.findElement(By.xpath("//div[@id='iteReportECons']/table[1]/tbody/tr[3]/td[1]"));
		String info=tableinfo.getText();
		System.out.println("Payment Details Bill no:-"+info);
		
		Thread.sleep(1000);
		WebElement Billtax=driver.findElement(By.xpath("//div[@id='iteReportECons']"));
		WebElement tableinfo2=Billtax.findElement(By.xpath("//div[@id='iteReportECons']/table/tbody/tr[3]/td[12]"));
		String info2=tableinfo2.getText();
		System.out.println("Taxinfo:-"+info2);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Bill Item Details']")));
		WebElement Billdetail=driver.findElement(By.xpath("//a[text()='Bill Item Details']"));
		Billdetail.click();
		
		Thread.sleep(1000);
		WebElement gennrepo=driver.findElement(By.xpath("//a[text()='Generate Report']"));
		gennrepo.click();
		js.executeScript("window.scrollBy(0,500)");
		System.out.println("--------------------------Bill details--------------------------");
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='iteReportECons']")));
		WebElement billno=driver.findElement(By.xpath("//div[@id='iteReportECons']"));
		WebElement tableinformation=billno.findElement(By.xpath("//div[@id='iteReportECons']/table/tbody/tr[3]/td[3]"));
		String txt=tableinformation.getText();
		System.out.println("Bill number:"+txt);
		
		Thread.sleep(3000);
		WebElement itemm=driver.findElement(By.xpath("//div[@id='iteReportECons']"));
		WebElement tableinformation1=itemm.findElement(By.xpath("//div[@id='iteReportECons']/table/tbody/tr[8]/td[9]"));
		String txt1=tableinformation1.getText();
		System.out.println("Item name:"+txt1);
		
		
		
		Thread.sleep(2000);
		WebElement auditrepo=driver.findElement(By.xpath("//span[text()='Audit Reports']"));
		auditrepo.click();
		
		
		
		Thread.sleep(1000);
		WebElement trackrepo=driver.findElement(By.xpath("//a[text()='KOT Tracking']"));
		trackrepo.click();
		System.out.println("-------------------Trackreport--------------------");
		
		Thread.sleep(1000);
		WebElement gennrepot=driver.findElement(By.xpath("//a[text()='Generate Report']"));
		gennrepot.click();
		System.out.println("we get report");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='iteReportECons']")));
		WebElement billnoo=driver.findElement(By.xpath("//div[@id='iteReportECons']"));
		WebElement informationn=billnoo.findElement(By.xpath("//div[@id='iteReportECons']/table/tbody/tr[4]/td[3]"));
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
		
		Thread.sleep(1000);
		WebElement sale=driver.findElement(By.xpath("//span[text()='Sales Reports']"));
		sale.click();
		
		Thread.sleep(1000);
		WebElement dic=driver.findElement(By.xpath("//a[text()='Discount Report']"));
		dic.click();
		System.out.println("open");
		
		WebElement gendis=driver.findElement(By.xpath("//a[text()='Generate Report']"));
		gendis.click();
		System.out.println("---------------------Discount Reports-----------------");
		
	
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='iteReportECons']")));
		WebElement tablee2=driver.findElement(By.xpath("//div[@id='iteReportECons']"));
		WebElement Billlno2=tablee2.findElement(By.xpath("//div[@id='iteReportECons']/table/tbody/tr[3]/td[8]"));
		String infobilll=Billlno2.getText();
		System.out.println("discount amt"+infobilll);
		
		Thread.sleep(1000);
		WebElement tablee3=driver.findElement(By.xpath("//div[@id='iteReportECons']"));
		WebElement Billno3=tablee3.findElement(By.xpath("//div[@id='iteReportECons']/table/tbody/tr[3]/th[2]"));
		String infobillll=Billno3.getText();
		System.out.println("tax:"+infobillll);
		
		Thread.sleep(1000);
		WebElement grand=driver.findElement(By.xpath("//div[@id='iteReportECons']"));
		WebElement grandiscount=grand.findElement(By.xpath("//div[@id='iteReportECons']/table/tbody/tr[3]/td[18]"));
		String gdinfo=grandiscount.getText();
		System.out.println("Granddiscount"+gdinfo);
		
		Thread.sleep(2000);
		WebElement paymentdetailss=driver.findElement(By.xpath("//span[text()='Sales Reports']"));
		paymentdetailss.click();
		Thread.sleep(1000);
		WebElement daily=driver.findElement(By.xpath("//a[text()='Daily Sales']"));
		daily.click();
		
		Thread.sleep(1000);
		WebElement gendailyrepo=driver.findElement(By.xpath("//a[text()='Generate Report']"));
		gendailyrepo.click();
		System.out.println("--------------------Daily report --------------------------");
		
		
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='iteReportECons']//div[2]")));
		WebElement dsr=driver.findElement(By.xpath("//div[@id='iteReportECons']//div[2]"));
		WebElement dsr2=dsr.findElement(By.xpath("//div[@id='iteReportECons']//div[2]/table/tbody/tr[4]/td"));
		String dsr3=dsr2.getText();
		System.out.println("Total sales:"+dsr3);
		
		
		WebElement cover=driver.findElement(By.xpath("//div[@id='iteReportECons']//div[2]"));
		WebElement cover1=cover.findElement(By.xpath("//div[@id='iteReportECons']//div[2]/table/tbody/tr[7]/td"));
		String cover2=cover1.getText();
		System.out.println("total cover:"+cover2);
		
		Thread.sleep(2000);
		WebElement taxsales=driver.findElement(By.xpath("//a[text()='Taxation/Sale Report']"));
		taxsales.click();
		
		Thread.sleep(1000);
		WebElement gentax=driver.findElement(By.xpath("//a[text()='Generate Report']"));
		gentax.click();
		System.out.println("----------------tax genrated--------------------------------");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='iteReportECons']")));
		WebElement tax=driver.findElement(By.xpath("//div[@id='iteReportECons']"));
		WebElement netsales=tax.findElement(By.xpath("//div[@id='iteReportECons']/table/tbody/tr[4]/td[1]"));
		String netsales1=netsales.getText();
		System.out.println("Netsales:"+netsales1);
		
		Thread.sleep(1000);
		WebElement gross=driver.findElement(By.xpath("//div[@id='iteReportECons']"));
		WebElement netgross=gross.findElement(By.xpath("//div[@id='iteReportECons']/table/tbody/tr[20]/td[1]"));
		String netgross1=netgross.getText();
		System.out.println("gross:"+netgross1);
		
		Thread.sleep(1000);
		WebElement collection=driver.findElement(By.xpath("//div[@id='iteReportECons']"));
		WebElement netcollection=collection.findElement(By.xpath("//div[@id='iteReportECons']/table/tbody/tr[25]/td[1]"));
		String netcollection1=netcollection.getText();
		System.out.println("collection Breakup:"+netcollection1);
		
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
