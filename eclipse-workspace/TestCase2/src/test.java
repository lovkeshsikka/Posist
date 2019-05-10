import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POSist\\Desktop\\testing\\testing\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Drtiver main class value : " + driver);
		String baseurl="http://entpstock.posist.net/login";
		driver.get(baseurl);
		login l=new login(driver);
		l.logintoposist("joutlet3", "joutlet3");
		bill b=new bill(driver);
		b.billl();
		Reports r=new Reports(driver);
		r.reports();

	}}
