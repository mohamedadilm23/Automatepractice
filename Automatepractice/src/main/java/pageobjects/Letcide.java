package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Letcide {


	@FindBy(id="APjFqb")
	public static WebElement searchgoogle;
	
	@FindBy(xpath = "(//h3[contains(@class,'LC20lb MBeuO')])[1]")
	public static WebElement letccodekoushik;
	
	@FindBy(linkText = "Log in")
	public static WebElement login;
	
	@FindBy(name = "email")
	public static WebElement Email;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(xpath = "//button[.='LOGIN']")
	public static WebElement loginbutton;

	@FindBy(xpath = "//a[@routerlink='/test']")
	public static WebElement Exploreworkspace;

	
	@FindBy(xpath = "//a[contains(text(),'All in One')]")
	public static WebElement forms;
	
	@FindBy(id = "firstname")
	public static WebElement firstname;
	
	@FindBy(xpath = "(//input[@class='input'])[2]")
	public static WebElement lastname;
	
	@FindBy(id = "email")
	public static WebElement email;
	
	@FindBy(id = "Phno")
	public static WebElement phonenumber;
	
	@FindBy(id = "Addl1")
	public static WebElement Addresslineno1;
	
	@FindBy(id = "Addl2")
	public static WebElement Addresslineno2;
	
	
	@FindBy(id = "state")
	public static WebElement state;

	
	@FindBy(id = "postalcode")
	public static WebElement postalcode;
	
	
	@FindBy(xpath = "(//div[@class='select']//select)[2]")
	public static WebElement country ;
	
	@FindBy(xpath = "(//label[@class='radio'])[1]")
	public static WebElement Gender ;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	public static WebElement iagree ;
	
	@FindBy(linkText ="Sign out")
	public static WebElement signout ;
	
	
	

}
