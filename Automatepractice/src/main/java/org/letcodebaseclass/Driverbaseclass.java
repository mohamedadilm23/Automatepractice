package org.letcodebaseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Driverbaseclass {


	String url="https://digiclass-admin-staging1.gcp.digivalitsolutions.com/login";
	protected  static RemoteWebDriver driver=null;
	@BeforeMethod
	public  void startapp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(url);
	}
	@AfterMethod
	public void closeapp() {
		driver.close();
	}	


}
