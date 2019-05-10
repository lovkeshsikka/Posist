import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reports {
	WebDriver driver;
	
	public Reports(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void  reports() throws InterruptedException {
		System.out.println("Driver Reports Value "+ driver);
		WebDriverWait wait=new WebDriverWait(driver, 100);
		JavascriptExecutor js = (JavascriptExecutor) driver;
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
		WebElement export=driver.findElement(By.xpath("//button[@class='form-control btn btn-default dropdown-toggle']"));
		export.click();
		
		Thread.sleep(1000);
		WebElement CSV=driver.findElement(By.xpath("//a[text()='CSV']"));
		CSV.click();
		
		Thread.sleep(1000);
		WebElement Excel=driver.findElement(By.xpath("//a[text()='Excel']"));
		Excel.click();
		
		
		
		
		
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
		System.out.println("Kot name"+item);
		
		Thread.sleep(2000);
		WebElement Complimentary=driver.findElement(By.xpath("//a[text()='Complimentary']"));
		Complimentary.click();
		
		Thread.sleep(1000);
		WebElement gencomp=driver.findElement(By.xpath("//a[text()='Generate Report']"));
		gencomp.click();
		System.out.println("------------------Compimentary reports------------------------------------ ");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='iteReportECons']")));
		WebElement Billingno=driver.findElement(By.xpath("//div[@id='iteReportECons']"));
		WebElement Billinginfo=Billingno.findElement(By.xpath("//div[@id='iteReportECons']/table/tbody/tr[4]/td[1]"));
		String Billinginfoo=Billinginfo.getText();
		System.out.println("Bill number"+Billinginfoo);
		
		Thread.sleep(1000);
		WebElement itemno=driver.findElement(By.xpath("//div[@id='iteReportECons']"));
		WebElement Billinginfooa=itemno.findElement(By.xpath("//div[@id='iteReportECons']/table/tbody/tr[4]/td[2]"));
		String Billinginfooe=Billinginfooa.getText();
		System.out.println("Item name"+Billinginfooe);
		
		Thread.sleep(1000);
		WebElement amt=driver.findElement(By.xpath("//div[@id='iteReportECons']"));
		WebElement amt1=amt.findElement(By.xpath("//div[@id='iteReportECons']/table/tbody/tr[4]/td[5]"));
		String amt2=amt1.getText();
		System.out.println("Amt"+amt2);
		
		Thread.sleep(1000);
		WebElement itemwise=driver.findElement(By.xpath("//span[text()='Category/Item Wise Reports']"));
		itemwise.click();
		
		Thread.sleep(1000);
		WebElement itemwise1=driver.findElement(By.xpath("//a[text()='Sale by Item Category']"));
		itemwise1.click();
		System.out.println("SalesByitemcategory");
		
		Thread.sleep(1000);
		WebElement genitem=driver.findElement(By.xpath("//a[text()='Generate Report']"));
		genitem.click();
		System.out.println("------------------SalesByitemcategory----------------------");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='iteReportECons']")));
		WebElement itemmname=driver.findElement(By.xpath("//div[@id='iteReportECons']"));
		WebElement itemmname1=itemmname.findElement(By.xpath("//div[@id='iteReportECons']/div[1]/table/tbody/tr[3]/td[2]"));
		String nameitem=itemmname1.getText();
		System.out.println("Itemname:"+nameitem);
		
		Thread.sleep(1000);
		WebElement qty=driver.findElement(By.xpath("//div[@id='iteReportECons']"));
		WebElement qty1=qty.findElement(By.xpath("//div[@id='iteReportECons']/div[1]/table/tbody/tr[3]/td[5]"));
		String qty2=qty1.getText();
		System.out.println("Qty:"+qty2);
		
		Thread.sleep(1000);
		WebElement netamt=driver.findElement(By.xpath("//div[@id='iteReportECons']"));
		WebElement net1=netamt.findElement(By.xpath("//div[@id='iteReportECons']/div[1]/table/tbody/tr[3]/td[10]"));
		String net2=net1.getText();
		System.out.println("Netamt:"+net2);
		
		
		
		
		
		
	}
	
	

}
