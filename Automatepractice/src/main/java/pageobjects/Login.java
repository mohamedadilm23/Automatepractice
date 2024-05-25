package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {

	@FindBy(id="mui-1")
	public static WebElement Useremail;
	
	@FindBy(id ="mui-2")
	public static WebElement password;
	
	@FindBy(xpath ="//button[text()='login']")
	public static WebElement loginclick;
	
	
	
	
	
	

	
	  /* public static  WebElement useremail(WebDriver driver) {
		return driver.findElement(By.id("mui-1"));
		}
 
		public static  WebElement password(WebDriver driver) {
		return driver.findElement(By.id("mui-2"));

		}
		public  static WebElement loginclick(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div/div/div[2]/div/div/form/div[3]/button"));
		}*/
	}


