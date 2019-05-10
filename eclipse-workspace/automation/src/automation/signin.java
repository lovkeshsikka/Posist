package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signin {
	
	public static void main(String[] args) {
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POSist\\Desktop\\testing\\testing\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		String baseurl="http://automationpractice.com/index.php";
		driver.get(baseurl);
		
		WebElement signup=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		signup.click();
		
		WebElement email=driver.findElement(By.id("email"));
		WebElement pass=driver.findElement(By.xpath("//input[@name='passwd']"));
		
		email.sendKeys("sikka.lovkesh6@gmail.com");
		pass.sendKeys("9643508962");
		
		WebElement sigiin=driver.findElement(By.xpath("//button[@name='SubmitLogin']"));
		sigiin.click();
		
		System.out.println("done");
		
		
		
		
		
	}

}
