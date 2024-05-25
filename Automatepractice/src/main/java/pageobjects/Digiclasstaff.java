package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Digiclasstaff {
	@FindBy(xpath = "(//div[@class='floating-label ']//input)[1]")
	public static WebElement Useremail;
	
	@FindBy(xpath = "//input[@class='floating-input loginfocus']")
	public static WebElement password;
	
	@FindBy(xpath = "//button[text()='LOGIN']")
	public static WebElement loginclick;
	
	@FindBy(linkText = "(//a[contains(@class,'d-flex align-items-center')])[2]")
	public static WebElement SAAM;

}

