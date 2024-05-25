package testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjects.Letcide;

public class TCLetcodepages {
@Test
public void letcodepages() throws InterruptedException
 {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Automatepractice\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		PageFactory.initElements(driver,Letcide.class);
		Letcide.searchgoogle.sendKeys("letcodewith kowshik"+Keys.ENTER);
		Letcide.letccodekoushik.click();
		Letcide.login.click();
		Letcide.Email.sendKeys("md.mohamedadil@gmail.com");
		Letcide.password.sendKeys("Mohamed@123");
		Letcide.loginbutton.click();
		Thread.sleep(2000);
		Letcide.Exploreworkspace.click();
		Letcide.forms.click();
		Letcide.firstname.sendKeys("Mohamed");
		Thread.sleep(2000);
		Letcide.lastname.sendKeys("adilm");
		Thread.sleep(2000);
		Letcide.email.clear();
		Letcide.phonenumber.sendKeys("8925046810");
		Letcide.Addresslineno1.sendKeys("kambar street");
		Letcide.Addresslineno2.sendKeys("trichy");
		Letcide.state.sendKeys("Indian");
		Letcide.postalcode.sendKeys("620020");
		Letcide.country.click();
		Letcide.Gender.click();
		Letcide.iagree.click();
		Thread.sleep(2000);
		Letcide.signout.click();
			
		
	}
}
				

