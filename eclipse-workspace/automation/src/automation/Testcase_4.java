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



public class Testcase_4 {
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
			
			WebElement printkot=driver.findElement(By.xpath("//label[text()='PrintKot']"));
			printkot.click();
			
			System.out.println("print KOT done");
			
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
			
			WebElement addclick=driver.findElement(By.xpath("//button[text()='Add Comment']"));
			addclick.click();
			
			Thread.sleep(1000);
			WebElement save=driver.findElement(By.xpath("//button[text()='Save']"));
			save.click();
			
			Thread.sleep(1000);
			WebElement tableclick=driver.findElement(By.xpath("//strong[text()='1']"));
			tableclick.click();
			
			System.out.println("table clicked");
			
			Thread.sleep(1000);
			WebElement printbill=driver.findElement(By.xpath("//label[text()='PrintBill']"));
			printbill.click();
			
			System.out.println("print of the bill");
			
			Thread.sleep(1000);
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
			
			System.out.println("check the payment details");
			
			Thread.sleep(60000);
			WebElement genreports=driver.findElement(By.xpath("//a[text()='Generate Report']"));
			genreports.click();
			js.executeScript("window.scrollBy(0,500)");
			System.out.println("reports genrated");
			
			Thread.sleep(2000);
			WebElement auditrepo=driver.findElement(By.xpath("//span[text()='Audit Reports']"));
			auditrepo.click();
			System.out.println("audit repo");
			
			Thread.sleep(2000);
			WebElement deletekot=driver.findElement(By.xpath("//a[text()='KOT Delete History']"));
			deletekot.click();
			System.out.println("delete kot details");
			
			Thread.sleep(1000);
			WebElement genrepo1=driver.findElement(By.xpath("//a[text()='Generate Report']"));
			genrepo1.click();
			
			System.out.println("Reports genrated");
			
			Thread.sleep(2000);
			WebElement item=driver.findElement(By.xpath("//div[@id='iteReportECons']"));
			WebElement tablerow=item.findElement(By.xpath("//table[@class='table table-striped table-bordered table-condensed']/tbody/tr[4]/td[3]"));
			String Rowtxt=tablerow.getText();
			System.out.println("information in the table:-"+Rowtxt);
			
			Thread.sleep(2000);
			WebElement trackingKot=driver.findElement(By.xpath("//a[text()='KOT Tracking']"));
			trackingKot.click();
			
			System.out.println("tracking report open");
			
			Thread.sleep(2000);
			WebElement genrepoo=driver.findElement(By.xpath("//a[text()='Generate Report']"));
			genrepoo.click();
			System.out.println("genreport of tracking");
			
			Thread.sleep(2000);
			WebElement kotnumber=driver.findElement(By.xpath(" //div[@id='iteReportECons']"));
			WebElement tableinfo=kotnumber.findElement(By.xpath(" //div[@id='iteReportECons']/table/tbody/tr[6]/td[1]"));
			String info=tableinfo.getText();
			System.out.println("Information in the table:"+info);
			
			WebElement tablebillno=driver.findElement(By.xpath(" //div[@id='iteReportECons']/table/tbody/tr[6]/td[3]"));
			String info1=tablebillno.getText();
			System.out.println("Bill no:"+info1);
			
			WebElement billnumber=driver.findElement(By.xpath(" //div[@id='iteReportECons']/table/tbody/tr[4]/td[1]"));
			String info2=billnumber.getText();
			System.out.println("kot Number:"+info2);
			
			
			System.out.println("check ");
			
			
			
			
			
			
			
		}
}
