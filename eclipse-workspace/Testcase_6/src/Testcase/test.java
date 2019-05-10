package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POSist\\Desktop\\testing\\testing\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String baseurl="http://entpstock.posist.net/login";
		driver.get(baseurl);
		Signin s=new Signin(driver);
		s.logintoposist("joutlet3", "joutlet3");
		Billsplit b=new Billsplit(driver);
		b.billsplit();
		Reports R=new Reports(driver);
		R.reports();
		
	}
}
