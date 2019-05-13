package testcase3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclass {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POSist\\Desktop\\testing\\testing\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Drtiver main class value : " + driver);
		String baseurl="http://entpstock.posist.net/login";
		driver.get(baseurl);
		Login l=new Login(driver);
		l.logintoposist("joutlet3", "joutlet3");
		Billing b=new Billing(driver);
		b.bill();
		Reports r=new Reports(driver);
		r.repo();
		
		
		
		
		
		
	}
}
