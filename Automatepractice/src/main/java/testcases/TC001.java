package testcases;

import org.letcodepages.loginpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjects.Login;

public class TC001 {
@Test
	public void Digischeduler () {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Automatepractice\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://digiclass-admin-staging1.gcp.digivalitsolutions.com/login");

		PageFactory.initElements(driver, Login.class);
		Login.Useremail.sendKeys("digiproductsadmin@digi.com");
		Login.password.sendKeys("12345678");
		Login.loginclick.click();
		
		
		
		
		
		
		/*Login.useremail(driver).sendKeys("digiproductsadmin@digi.com");
		Login.password( driver).sendKeys("12345678");
		Login.loginclick(driver).click();*/

	}

}
