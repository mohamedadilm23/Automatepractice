package org.letcodepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Digi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\digiclass\\\\driver\\\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
  
   driver.get("https://digiclass-admin-staging1.gcp.digivalitsolutions.com/login");

   
   
   
   
   
  // WebElement emailbox= driver.findElement(By.id("mui-1"));
   //emailbox.sendKeys("digiproductsadmin@digi.com");
   
  // WebElement passwordbox=driver.findElement(By.id("mui-2"));
  // passwordbox.sendKeys("12345678");
   
  // WebElement loginbutton=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div/div/div[2]/div/div/form/div[3]/button"));
  // loginbutton.click();
  // driver.manage().window().maximize();

	}
}
