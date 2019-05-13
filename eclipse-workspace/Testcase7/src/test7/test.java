package test7;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\POSist\\Desktop\\testing\\testing\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println("Drtiver main class value : " + driver);
	String baseurl="http://entpstock.posist.net/login";
	driver.get(baseurl);
	Loginn l=new Loginn(driver);
	l.logintoposist("joutlet3", "joutlet3");
	billing b=new billing(driver);
	b.billcut();
	Reports r=new Reports(driver);
	r.repo();
	
  }
	

}
