package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEstdownload {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\POSist\\Desktop\\testing\\testing\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	String baseurl="http://entpstock.posist.net/login";
	driver.get(baseurl);
	Download d=new Download(driver);
	d.logintoposist("joutlet3", "joutlet3");
	Downloadreports dr=new Downloadreports(driver);
	dr.report();
	
	
	
	
}
}
