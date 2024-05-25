package org.letcodepages;

import org.letcodebaseclass.Driverbaseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class loginpage  extends Driverbaseclass{

	//RemoteWebDriver driver=null;
	//locators
	 public boolean getuseremaillabel(){
		return driver.findElement(By.xpath("//label[text()='Email']")).isDisplayed();
	}
	 public boolean getpasswordabel(){
	 return driver.findElement(By.xpath("//label[text()='Password']")).isDisplayed();
		}
	
	
	
	
	
	
	
	//actions
	
	public  loginpage Enteremail(String email){
	driver.findElement(By.className("mui-5")).sendKeys("digiproductsadmin@digi.com");
	return this;
	}

	public loginpage Enterpassword(String passsword){
	
	driver.findElement(By.id("mui-6")).sendKeys("12345678");
	return  this;
	}

	public Dashboard Enterclicklogin(){
	driver.findElement(By.xpath("//button[text()='login']")).click();
	return new Dashboard();
	}

	    public Forgotpasswordpage Forgotpassword(String forgotpassword){
		driver.findElement(By.xpath("//p[contains(@class,'pt-2 mb-0')]")).click();
		return new Forgotpasswordpage();
	}
	
	
	/**
	 * @description this function is used to login Digischeduler
	 * @param email
	 * @param password
	 */
	public void login(String email,String password) {
		Enteremail(email);
		Enterpassword(password);
		Enterclicklogin();
		
		
	}
	
	
	
	
	
	
	
}
