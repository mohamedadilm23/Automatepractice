package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjects.Digiclasstaff;
@Test
public class TCDCF01 {

	public void DigiClass () {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Automatepractice\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://digiclass-staging1.gcp.digivalitsolutions.com/lms/staff/warning");
		PageFactory.initElements(driver,Digiclasstaff .class);
		Digiclasstaff.Useremail.sendKeys("digiproductsadmin@digi.com");
	    Digiclasstaff.password.sendKeys("12345678");
	    Digiclasstaff.loginclick.click();
	    Digiclasstaff.SAAM.click();
	    
	    
	    
	}
}
